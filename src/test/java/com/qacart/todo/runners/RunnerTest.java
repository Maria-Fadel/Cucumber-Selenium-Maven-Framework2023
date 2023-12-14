package com.qacart.todo.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin   = {"html:target/TestReport.html"},
        features = "src/test/resources/features",      // where is the features to find
        glue = "com/qacart/todo"           // glue is the steps-path
)
public class RunnerTest  extends AbstractTestNGCucumberTests {

}