package stepDefinitions;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class ShoppingSteps implements En {
    private int budget = 0;

    public ShoppingSteps() {

        Given("^I have (\\d+) in my wallet$", (Integer money) -> budget = money);
        When("^I buy .* with (\\d+)$", (Integer price) -> budget -= price);
        Then("^I should have (\\d+) in my wallet$", (Integer finalBudget) ->
                Assertions.assertEquals(budget, finalBudget.intValue()));

        //Option 2:
//        Given("I have {int} in my wallet", (Integer money) -> budget = money);
//        When("I buy {word} with {int}", (String product, Integer price) -> budget -= price);
//        Then("I should have {int} in my wallet", (Integer finalBudget) ->
//                Assertions.assertEquals(budget, finalBudget.intValue()));
    }
}
