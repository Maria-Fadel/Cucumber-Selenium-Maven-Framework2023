package com.example.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
public class DriverFactory {
    private final static ThreadLocal <WebDriver> driver = new ThreadLocal<>();
    public static WebDriver initDriver(){
        WebDriver driver;
        String browser = System.getProperty("browser","CHROME");

        switch (browser){
            case "CHROME" ->{
                driver = new ChromeDriver();
            }
            case "FIREFOX" ->{
                driver = new FirefoxDriver();
            }
            case "EDGE" ->{
                driver = new EdgeDriver();
            }
            default -> {
                throw new RuntimeException("Browder is not supported");
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        DriverFactory.driver.set(driver);
        return driver;
    }
    public static WebDriver getDriver(){

        return driver.get();
    }
}
