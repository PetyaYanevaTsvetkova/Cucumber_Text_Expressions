package stepDefinitions;
import io.cucumber.java8.En;

public class LambdaSteps implements En {

    public LambdaSteps() {
        Given("^I add 1 and 2$", () -> {
            System.out.println("Adding 1 and 2");
        });
        Then("^I verify that sum is 3$", () -> {
            System.out.println("Checking that sum is 3");
        });
    }
}
