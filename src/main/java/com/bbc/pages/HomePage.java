package com.bbc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by vs on 28.07.2016.
 */
public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@class='module__title']/span")
    private WebElement WelcomeText;

    @FindBy(xpath = ".//*[@class='orb-nav-sport']/a")
    private WebElement MenuLinkSport;

    public String GetWelcomeText() {
        return WelcomeText.getText();
    }

    public void ClickSportLink() {
        MenuLinkSport.click();
    }
}
