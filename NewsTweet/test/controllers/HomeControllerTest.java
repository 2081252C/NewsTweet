package controllers;

import org.junit.*;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import play.test.WithBrowser;
import play.test.WithServer;
import play.test.*;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;
import play.db.Database;
import play.db.Databases;
import play.db.evolutions.*;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;



public class HomeControllerTest extends WithBrowser {

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
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testLogin() {
        running(testServer(), HTMLUNIT, browser -> {
            browser.goTo("/");
            assertEquals("NewsTweet", browser.$("title").text());
            browser.$("#login-button").click();
            assertEquals(browser.url().contains("https://api.twitter.com/"), true);
        });
    }

    @Test
    public void testSearch() {
        running(testServer(), HTMLUNIT, browser -> {
            String searchPhrase = "beast from the east";
            browser.goTo("/");
            browser.$("#searchTerm").fill().with(searchPhrase);
            browser.$("#searchTerm").submit();
            assertEquals(browser.url().contains("beast+from+the+east"), true);
        });
    }

    @Test
    public void testSearchType() {
        running(testServer(), HTMLUNIT, browser -> {
            browser.goTo("/");
            assertEquals(browser.$("#searchType_field").text().contains("Content"), true);
            assertEquals(browser.$("#searchType_field").text().contains("Hashtag"), true);
            assertEquals(browser.$("#searchType_field").text().contains("User"), true);
        });
    }

    @Test
    public void testSampleInterests() {
        running(testServer(), HTMLUNIT, browser -> {
            browser.goTo("/");
            browser.$("#personaBreakingNews").click();
            browser.$("#UK").click();
            System.out.println(browser.$("#UK").text());
            assertEquals(browser.url(), "interest/Breaking%20News/UK");
        });
    }

    @Test
    public void testCategories() {
        running(testServer(), HTMLUNIT, browser -> {
            browser.goTo("/");
            browser.$("#news-btn").click();
            System.out.println(browser.url());
             //wait for scripts to load
            browser.await().atMost(10, TimeUnit.SECONDS).until(browser.$("#header")).present();
            assertEquals(browser.url(), "news");
        });
    }

}
