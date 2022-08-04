package com.iplato.pages;

import com.iplato.functionality.Utility;
import gherkin.lexer.Fi;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.smartcardio.ATR;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LoginPage extends Utility {
    private static final Logger log = Logger.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='login_inp']")
    WebElement userNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='error']")
    WebElement errorMessage;


    public String getErrorMessageText(){
        log.info("Get Error Text : "+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnLoginButton(){

        log.info("Click on Login button : "+loginButton.toString());
        clickOnElement(loginButton);
    }

    public void setPasswordField(String password){
        log.info("Send password to passwordField : "+passwordField.toString());
        sendTextToElement(passwordField,password);

    }
    public void setUserNameField(String userName) {
        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        //Convert Set into List
        List<String> hList = new ArrayList<>(handles);

        switchToRightWindow("Login Page", hList);

        log.info("Send username to usernameField : "+userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

}
