package com.bbc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vs on 28.07.2016.
 */
public class PageBase
{
    public WebDriver driver;

    public PageBase(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}
