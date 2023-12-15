package com.qacart.todo.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AppleSteps {

    @ParameterType(value = ".*", name = "string")
    public String string(String value) {
        return value;
    }

    @Given("There are in the basket just {string}")
    public void thereAreInTheBasketJust(String basket) {
        System.out.println("There are in the basket just " + basket);
        System.out.println("There are in the basket just " + basket);
    }

    @When("I can eat {int} right now")
    public void iCanEatRightNow(Integer eat) {
        System.out.println("I can eat " + eat + " right now");
    }

    @Then("The rest of apples will be {int} apple")
    public void theRestOfApplesWillBeApple(Integer rest) {
        System.out.println("The rest of apples will be " + rest + " apple");
    }
}