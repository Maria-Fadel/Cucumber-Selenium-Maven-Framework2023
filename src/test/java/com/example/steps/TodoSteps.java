package com.example.steps;

import com.example.pages.LoginPage;
import com.example.pages.NewTodoPage;
import com.example.pages.TodoPage;
import com.example.utils.EnvUtils;
import com.example.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;


public class TodoSteps {

    WebDriver driver;
    @Given("User is in the todos page")
    public void userIsAtTheLoginPage() throws IOException {
        driver = DriverFactory.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load(EnvUtils.getInstance().getURL() +"/login");
        loginPage.login(EnvUtils.getInstance().getEmail(),EnvUtils.getInstance().getPassword());

    }
    @When("User add to the list a {string}")
    public void userAddToTheListANewTodo(String newTodo){

        new TodoPage(driver).plusButtomClick();
        new NewTodoPage(driver).addTodo(newTodo);
    }
    @Then("The {string} should be added correctly")
    public void theNewTodoShouldBeAddedCorrectly(String newTodo){

        String text = new TodoPage(driver).getLastTodoText();
        Assert.assertEquals(text,newTodo);
    }
}