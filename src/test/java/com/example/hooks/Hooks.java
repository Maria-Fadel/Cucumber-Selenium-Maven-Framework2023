package com.example.hooks;

import com.example.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;
    @Before
    public void setup (){
         driver =  DriverFactory.initDriver();
    }
    @After
    public void treanDown(){
    driver.quit();
    }

}
