package stepDefinishions;

import helper.StringHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CompareSentencesSteps {
    private String firstSentence;
    private String secondSentence;
    private boolean isCaseSensitive;

    @ParameterType("true|false")
    public boolean aBool(String bol) {
        return Boolean.parseBoolean(bol);
    }

    @Given("case sensitive is set on: {aBool}")
    public void setCaseSensitive(boolean aBool) {
        isCaseSensitive = aBool;
    }

    @Given("First sentence is {}")
    public void firstSentenceISetTheFirstSentenceToCucumberIsAmazing(String sentence) {
        firstSentence = sentence;
    }

    @When("Second sentence is {}")
    public void secondSentenceISetTheSecondSentenceToCucumberIsAmazing(String sentence) {
        secondSentence = sentence;
    }

    @Then("Verify if sentences are equal")
    public void verifyIfSentencesAreEqual() {
        if (isCaseSensitive) {
            System.out.println("Sentences are not equal");
            Assertions.assertFalse(StringHelper.areSentencesEqual
                    (firstSentence, secondSentence, isCaseSensitive));
        } else {
            System.out.println("Sentences are equal");
            Assertions.assertTrue(StringHelper.areSentencesEqual
                    (firstSentence, secondSentence, isCaseSensitive));
        }
    }
}
