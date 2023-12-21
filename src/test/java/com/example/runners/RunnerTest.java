package com.example.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin   = {"html:target/TestReport.html",
                   "json:target/cucumber-reports/cucumber.json"},
        features = "src/test/resources/features",      // where is the features to find
        glue = "com/example"           // glue is the steps-path
)
public class RunnerTest  extends AbstractTestNGCucumberTests {

}