package com.bbc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vs on 28.07.2016.
 */
public class SportPage extends PageBase{

    public SportPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@class='primary-nav__items']/li[4]/a/span")
    private WebElement FootballLink;

    public boolean IsAt()
    {
        if (FootballLink.getText().equals("Football"))
        {
            return true;
        }
        return false;
    }
}
