package com.bbc.tests;

import com.bbc.pages.HomePage;
import com.bbc.pages.SportPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vs on 28.07.2016.
 */
public class BbcTests extends TestBase {

    @Test
    public void WelcomeTextIsPresented() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        String expectedText = "Welcome to BBC.com";

        String actualText = homePage.GetWelcomeText();

        assertEquals(actualText, expectedText);
    }

    @Test
    public void MainMenuPresentedOnSport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.ClickSportLink();

        SportPage sportPage = new SportPage(driver);

        boolean result =  sportPage.IsAt();

        assertTrue(result);
    }
}
