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


public class SearchControllerTest extends WithBrowser {

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
    public void testTrackSearch() {
            String searchPhrase = "beast from the east";

            //login
            browser.goTo("/");
            browser.$("#login-button").click();
            System.out.println(browser.url().toString());
            browser.$("#username_or_email").fill().with("newstweetTest");
            browser.$("#password").fill().with("test1234");
            browser.$("#allow").submit();

            //wait to be redirected from twitter
            browser.await().atMost(8, TimeUnit.SECONDS);

            //check that track modal opens and is prefilled with search term
            browser.$("#searchTerm").fill().with(searchPhrase);
            browser.$("#searchTerm").submit();
            browser.$("#track_btn").click();
            assertEquals(browser.$("#term_field").text(), searchPhrase);
    }

    @Test
    public void testAddInterest() {
            String searchPhrase = "beast from the east";

            //login
            browser.goTo("/");
            browser.$("#login-button").click();
            System.out.println(browser.url().toString());
            browser.$("#username_or_email").fill().with("newstweetTest");
            browser.$("#password").fill().with("test1234");
            browser.$("#allow").submit();

            //wait to be redirected from twitter
            browser.await().atMost(8, TimeUnit.SECONDS);

            //check that create interest form is available
            browser.$("#searchTerm").fill().with(searchPhrase);
            browser.$("#searchTerm").submit();
            browser.$("#track_btn").click();
            assertEquals(browser.$("#to-be-hidden").text().contains("create a new interest"), true);
    }


    @Test
    public void testAddPersona() {
            String searchPhrase = "beast from the east";

            //login
            browser.goTo("/");
            browser.$("#login-button").click();
            System.out.println(browser.url().toString());
            browser.$("#username_or_email").fill().with("newstweetTest");
            browser.$("#password").fill().with("test1234");
            browser.$("#allow").submit();

            //wait to be redirected from twitter
            browser.await().atMost(8, TimeUnit.SECONDS);

            //check that create persona form is available
            browser.$("#searchTerm").fill().with(searchPhrase);
            browser.$("#searchTerm").submit();
            browser.$("#track_btn").click();
            browser.$("#createinterest").click();
            assertEquals(browser.$("#be-hidden").text().contains( "create a new Interest Category"), true);
    }

}
