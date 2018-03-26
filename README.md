# NewsTweet
Level 4 Project

Twitter is a popular social media website. News stories often surface on Twitter first as users will tweet about events as they happen, and as a result many trending topics and hashtags are related to headlines or news stories in some way. Unfortunately both trending topics and hashtags have a short life expectancy, so currently there is no way to track news stories over a period of time. The solution is to build an application which allows users to save the tweets found in search results to entities which represent a news story. The entity will contain both old and new search results so specific tweets are easy to find at a later time. My application, NewsTweet, aims to emulate this solution.

To set up NewsTweet:

1. Open the conf/application.conf file:
    - Update `db.default.url` to 
    `"jdbc:h2:file:YOUR_PATH_TO_NEWSTWEET_DIRECTORY/NewsTweet/data/db;MODE=MYSQL;DB_CLOSE_DELAY=-1;DATABASE_TO_UPPER=FALSE"`
    - Update `db.test.url` to 
     `"jdbc:h2:file:YOUR_PATH_TO_NEWSTWEET_DIRECTORY/NewsTweet/data/test;MODE=MYSQL"`
2. Open the app/controllers/HomeController.java file:
    - Update `TRAINING_DIR` to 
    `new File("YOUR_PATH_TO_NEWSTWEET_DIRECTORY/NewsTweet/app/controllers/classifyTweets/categories-train");`
    
To run NewsTweet:
1. Using the command line, navigate to the NewsTweet directory and type `sbt run`.
2. Navigate to `localhost:9000` on your browser.
3. If necessary, apply database evolutions. 
4. You should now be seeing the NewsTweet homepage.


