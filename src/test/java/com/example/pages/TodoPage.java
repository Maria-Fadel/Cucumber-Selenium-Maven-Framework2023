package com.example.pages;

import com.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage extends BasePage {
    public TodoPage(WebDriver driver) {
        super(driver);
    }
    private final By welcomeMessage = By.cssSelector("[data-testid=welcome]");
    private final By plusButtom = By.cssSelector("[data-testid=add]");
    private final By todoItems = By.cssSelector("[data-testid=todo-item]");

    public boolean isWelcomeDisplayed(){
        return driver.findElement(welcomeMessage).isDisplayed();
    }
    public void plusButtomClick(){
        driver.findElement(plusButtom).click();
    }
    public String getLastTodoText(){
        return driver.findElements(todoItems).get(0).getText();
    }
}
