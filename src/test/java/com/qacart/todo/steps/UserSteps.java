package com.qacart.todo.steps;

import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utils.EnvUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
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
