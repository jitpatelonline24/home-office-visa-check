package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
     @Given("I am on homepage")
    public void iAmOnHomepage() {
         System.out.println("This is @Given");

    }
    @When("I click on login link")
    public void iClickOnLoginLink() {
         new HomePage().clickOnLoginLink();
     }
    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String username) {
         new LoginPage().enterEmailId(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
         new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
         new LoginPage().clickOnLoginButton();
    }

    @Then("I should log in successfully")
    public void iShouldLogInSuccessfully() {
         new LoginPage().getWelcomeText();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
         Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage,"Error Message not Displayed");
    }
}
