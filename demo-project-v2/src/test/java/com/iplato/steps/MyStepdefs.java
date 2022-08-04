package com.iplato.steps;

import com.iplato.pages.HomePage;
import com.iplato.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {


    @Given("^I accept cookies$")
    public void iAcceptCookies() {



    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().clickOnAcceptCookies();
    }

    @When("^I click on Sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^Error message displayed with wrong username or password$")
    public void errorMessageDisplayedWithWrongUsernameOrPassword() {
        String actual = new LoginPage().getErrorMessageText();
        String expected = "I am sorry, but the user name or password entered is wrong. Please, try again.";
        Assert.assertEquals("Error message not displayed",expected,actual);
    }

    @And("^I enters 'username' with \"([^\"]*)\"$")
    public void iEntersUsernameWith(String arg0){
        new LoginPage().setUserNameField(arg0);
    }

    @And("^I enters 'password' with \"([^\"]*)\"$")
    public void iEntersPasswordWith(String arg0){
        new LoginPage().setPasswordField(arg0);
    }
}
