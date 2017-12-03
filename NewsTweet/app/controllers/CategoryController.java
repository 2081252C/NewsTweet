package controllers;

import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.QueryResult;
import twitter4j.Query;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;
import java.util.ArrayList;
import models.Search;
import models.Persona;
import play.data.Form;
import play.data.FormFactory;
import javax.inject.Inject;
import models.TwitterUser;
import com.aliasi.classify.Classification;
import com.aliasi.classify.Classified;
import com.aliasi.classify.ConfusionMatrix;
import com.aliasi.classify.DynamicLMClassifier;
import com.aliasi.classify.JointClassification;
import com.aliasi.classify.JointClassifier;
import com.aliasi.classify.JointClassifierEvaluator;
import com.aliasi.classify.LMClassifier;

import com.aliasi.lm.NGramProcessLM;

import com.aliasi.util.AbstractExternalizable;

import java.io.File;
import java.io.IOException;

import com.aliasi.util.Files;

import twitter4j.*;

import play.*;
import play.mvc.*;
import play.data.*;


public class CategoryController extends Controller{

	@Inject FormFactory formFactory;

	List<String> top = new ArrayList<>();
	List<String> classify = new ArrayList<>();

	private final Object lock = new Object();

	private static File TRAINING_DIR
        = new File("/home/carly/Documents/Project/NewsTweet/NewsTweet/app/controllers/classifyTweets/categories-train");

    private static File TESTING_DIR
        =  new File("/classifyTweets/categories-test");

    private static String[] CATEGORIES
        = { "entertainment", "gaming", "music", "news", "tech" };

    private static int NGRAM_SIZE = 6;


	public Result categories() throws ClassNotFoundException, IOException{

			top.clear();

			ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        		configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
                .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();

	        Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
	        String name = personaForm.field("personaName").value();
	        //List interests = personaForm.field("interests").value();

		    //Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
		    //twitter.setOAuthConsumer("AfZgXUsXP3v9F3DYIMVx2q7KH", "NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");
		    TwitterStream twitterStream = new TwitterStreamFactory(configurationBuilder.build()).getInstance();
   			StatusListener listener = new StatusListener() {
	            @Override
	            public void onStatus(Status status) {
	                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
	          		System.out.println(status.getRetweetedStatus().getRetweetCount());
	                if(status.getRetweetedStatus().getRetweetCount()>1000){
	                	top.add(Long.toString(status.getId()));
	                	classify.add(status.getText());
	                }
			        //System.out.println(statuses.size() + ":" + status.getText());
			        if (top.size() == 50) {
			          synchronized (lock) {
			            lock.notify();
			          }
			          System.out.println("unlocked");
			        }
	            }

	            @Override
	            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
	                System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
	            }

	            @Override
	            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
	                System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
	            }

	            @Override
	            public void onScrubGeo(long userId, long upToStatusId) {
	                System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
	            }

	            @Override
	            public void onStallWarning(StallWarning warning) {
	                System.out.println("Got stall warning:" + warning);
	            }

	            @Override
	            public void onException(Exception ex) {
	                ex.printStackTrace();
	            }
    	};
        twitterStream.addListener(listener);
        twitterStream.sample("en");

        try {
	      synchronized (lock) {
	        lock.wait();
	      }
	    } catch (InterruptedException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    System.out.println("returning statuses");
	    twitterStream.shutdown();

	    DynamicLMClassifier<NGramProcessLM> classifier
            = DynamicLMClassifier.createNGramProcess(CATEGORIES,NGRAM_SIZE);

            for(int i=0; i<CATEGORIES.length; ++i) {
            File classDir = new File(TRAINING_DIR,CATEGORIES[i]);
            if (!classDir.isDirectory()) {
                String msg = "Could not find training directory="
                    + classDir
                    + "\nHave you unpacked 4 newsgroups?";
                System.out.println(msg); // in case exception gets lost in shell
                throw new IllegalArgumentException(msg);
            }

	            String[] trainingFiles = classDir.list();
	            for (int j = 0; j < trainingFiles.length; ++j) {
	                File file = new File(classDir,trainingFiles[j]);
	                String text = Files.readFromFile(file,"ISO-8859-1");
	                System.out.println("Training on " + CATEGORIES[i] + "/" + trainingFiles[j]);
	                Classification classification
	                    = new Classification(CATEGORIES[i]);
	                Classified<CharSequence> classified
	                    = new Classified<CharSequence>(text,classification);
	                classifier.handle(classified);
	            }
	        }

	    @SuppressWarnings("unchecked") // we created object so know it's safe
        JointClassifier<CharSequence> compiledClassifier
            = (JointClassifier<CharSequence>)
            AbstractExternalizable.compile(classifier);

        boolean storeCategories = true;
        JointClassifierEvaluator<CharSequence> evaluator
            = new JointClassifierEvaluator<CharSequence>(compiledClassifier,
                                                         CATEGORIES,
                                                         storeCategories);
        for(int i = 0; i < CATEGORIES.length; ++i) {
            //File classDir = new File(TESTING_DIR,CATEGORIES[i]);
            for (int j=0; j<classify.size();  ++j) {
                String text = classify.get(j);
                System.out.print("Testing on " + CATEGORIES[i] + "/" + text + " ");
                Classification classification
                    = new Classification(CATEGORIES[i]);
                Classified<CharSequence> classified
                    = new Classified<CharSequence>(text,classification);
                evaluator.handle(classified);
                JointClassification jc =
                    compiledClassifier.classify(text);
                String bestCategory = jc.bestCategory();
                String details = jc.toString();
                System.out.println("Got best category of: " + bestCategory);
                System.out.println(jc.toString());
                System.out.println("---------------");
            }
        }
        ConfusionMatrix confMatrix = evaluator.confusionMatrix();
        System.out.println("Total Accuracy: " + confMatrix.totalAccuracy());

        System.out.println("\nFULL EVAL");
        System.out.println(evaluator);

        //System.out.println(term);
         String str = session("id");
        if(str!=null){
	        Long id = Long.parseLong(str);
	        TwitterUser t = TwitterUser.find.byId(1561842786L);
			String s = t.username;
		    return ok(views.html.categories.render(searchForm, s, 1, personaForm, t.imgUrl, top));
		}
	    else{
	        	return ok(views.html.categories.render(searchForm, "", 0, personaForm, "", top));
	        }
    }
}