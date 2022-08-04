package com.iplato.pages;

import com.iplato.functionality.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='ccc-notify-accept']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement logInLink;

    public static void main(String[] args) {

    }

    public void clickOnLoginLink(){

        log.info("Click on Login link : "+logInLink.toString());
        clickOnElement(logInLink);
    }

    public void clickOnAcceptCookies(){

        log.info("Click on Accept cookies : "+acceptCookies.toString());
        clickOnElement(acceptCookies);
    }



}
