package controllers;

import org.junit.*;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.*;
import play.mvc.Result;
import play.test.WithApplication;
import play.test.WithBrowser;
import play.test.WithServer;
import play.test.*;
import models.TwitterUser;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;
import play.db.Database;
import play.db.Databases;
import play.db.evolutions.*;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

import twitter4j.Twitter;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.DirectMessage;
import twitter4j.User;
import twitter4j.Status;
import twitter4j.MediaEntity;
import twitter4j.TwitterFactory;
import twitter4j.QueryResult;
import twitter4j.Query;
import twitter4j.IDs;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;



public class SearchResultsTest extends WithBrowser {

    Database test;

    @Before
    public void setupDatabase() {
        test = Databases.inMemory();
        Evolutions.applyEvolutions(test);
    }

    @After
    public void shutdownDatabase() {
        Evolutions.cleanupEvolutions(test);
        test.shutdown();
    }

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }


    @Test
    public void testSearchFilters() {
        running(testServer(), HTMLUNIT, browser -> {
            String searchPhrase = "beast from the east";
            browser.goTo("/");
            browser.$("#searchTerm").fill().with(searchPhrase);
            browser.$("#searchTerm").submit();
            browser.await().atMost(10, TimeUnit.SECONDS).until(browser.$("#recent_tab")).displayed();
            assertEquals(browser.$("#recent_tab").text(), "Recent");
            assertEquals(browser.$("#popular_tab").text(), "Top 15 Tweets");
            assertEquals(browser.$("#media_tab").text(), "Photos, Videos and Links");
        });
    }

    @Test
    public void testAnalytics() {
        running(testServer(), HTMLUNIT, browser -> {
            String searchPhrase = "beast from the east";
            browser.goTo("/");
            browser.$("#searchTerm").fill().with(searchPhrase);
            browser.$("#searchTerm").submit();
            browser.await().atMost(3, TimeUnit.SECONDS);
            browser.$("#analytics-btn").click();
            browser.await().atMost(60, TimeUnit.SECONDS).until(browser.$("#SearchAnalytics")).displayed(); 
            System.out.println(browser.url());
            assertEquals(browser.$("#SearchAnalytics").text().contains("Sentiment"), true);
            assertEquals(browser.$("#SearchAnalytics").text().contains("Related Terms"), true);
            assertEquals(browser.$("#SearchAnalytics").text().contains("Network"), true);
        });
    }

    public boolean noDuplicates(){
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
            .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
            .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
            .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c")
            .setTweetModeExtended(true);

        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();

        List<Status> allRecent = new ArrayList<>();
        Query query = new Query("hello+world");
        query.lang("en");
        try{
            query.setCount(100);
            query.setResultType(Query.RECENT);
            QueryResult result = twitter.search(query);

            for (Status status : result.getTweets()) {
                if(status.isRetweet()){ 
                    status = status.getRetweetedStatus();
                }
                if(!allRecent.contains(status)){
                    allRecent.add(status);
                }                   
            }
        }
        catch (TwitterException e){
            System.out.println("error");
        }

        Set<Status> set = new HashSet<Status>(allRecent);

        if(set.size() < allRecent.size()){
            return false;
        }

        return true;
    }

    @Test 
    public void testNoDuplicates(){
        boolean test = noDuplicates();
        assertEquals(test, true);
    }

    @Test 
    public void measureLatency(){
        TwitterUser t = new TwitterUser(100L, "test", "", "", "");
        LatencyMeasure lm = new LatencyMeasure(1000000);
 
        for (int i = 0; i < 100000; i++) {
            lm.startMeasure();
            t.save();
            lm.endMeasure();
        }
        lm.printStats();
        
    }
}
