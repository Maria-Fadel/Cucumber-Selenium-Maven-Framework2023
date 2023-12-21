package com.example.steps;

import com.example.pages.TodoPage;
import com.example.factory.DriverFactory;
import com.example.pages.LoginPage;
import com.example.utils.EnvUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;


public class UserSteps {

    WebDriver driver;
    @Given("User is at the login page")
    public void userIsAtTheLoginPage() throws IOException {
        driver = DriverFactory.getDriver();
        new LoginPage(driver).load(EnvUtils.getInstance().getURL() +"/login");
    }
    @When("User fill the email and password and login")
    public void userFillTheEmailAndPasswordAndLoginT(){
        new LoginPage(driver).login("hatem@example.com","Test1234");
    }
    @Then("Welcome massage should be displayed")
    public void weocomeMassageShouldBeDisplayed(){
        boolean isWelcomeDisplayes = new TodoPage(driver).isWelcomeDisplayed();
        Assert.assertTrue(isWelcomeDisplayes);
    }
}
