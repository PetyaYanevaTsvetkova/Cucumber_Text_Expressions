package stepDefinishions;

import io.cucumber.java.af.En;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.lang.annotation.Annotation;

public class LambdaSteps {

    public LambdaSteps() {
        Given("^I add 1 and 2$", () -> {
            System.out.println("Adding 1 and 2");
        });
        Then("^I verify that sum is 3$", () -> {
            System.out.println("Checking that sum is 3");
        });
    }
}
