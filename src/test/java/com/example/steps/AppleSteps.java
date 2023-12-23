package com.example.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AppleSteps {


    @Given("There are in the basket just {int}")
    public void thereAreInTheBasketJust(int basket) {
        System.out.println("There are in the basket just " + basket);
        System.out.println("There are in the basket just " + basket);
        System.out.println("Hallo Heilani");
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