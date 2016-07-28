package com.bbc.tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vs on 28.07.2016.
 */
public class TestBase {

    public static WebDriver driver;
    String url = "http://bbc.com";

    @BeforeClass
    public static void BeforeClass(){
        driver = new FirefoxDriver();
    }

    @Before
    public void Before(){
        driver.get(url);
    }

    @AfterClass
    public static void AfterClass() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
