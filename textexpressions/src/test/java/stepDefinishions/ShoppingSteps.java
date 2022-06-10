package stepDefinishions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ShoppingSteps {
    private int budget = 0;

    public ShoppingSteps() {
        Given ("I have (\\d+) in my wallet", (Integer money) -> budget = money);
        When ("I buy .* with (\\d+)", (Integer price) -> budget -= price);
        Then ("I should have (\\d+) in my wallet", (Integer finalBudget) ->
                Assertions.assertEquals(budget, finalBudget.intValue()));
    }
}
