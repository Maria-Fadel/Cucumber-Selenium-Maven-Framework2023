package com.qacart.todo.steps;

import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utils.EnvUtils;
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
    @When("User add a new todo")
    public void userAddANewTodo(){

        new TodoPage(driver).plusButtomClick();
        new NewTodoPage(driver).addTodo("Learn Cucumber");
    }
    @Then("Todo should be added correctly")
    public void shouldBeAddedCorrectly(){

        String text = new TodoPage(driver).getLastTodoText();
        Assert.assertEquals(text,"Learn Cucumber");
    }
}