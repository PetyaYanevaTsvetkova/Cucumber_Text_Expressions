package stepDefinitions;

import helper.StringHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WordAndCharCountSteps {
    private String textParagraph;
    private int wordsCountFromText;
    private int charsCount;

    @Given("The following text is given:")
    public void theFollowingTextIsGiven(String text) {
        textParagraph = text;
    }

    @When("I get the word count")
    public void iGetTheWordCount() {
        wordsCountFromText = StringHelper.getWordsCountFromText(textParagraph);
    }

    @When("I get the char count")
    public void iGetTheCharCount() {
        charsCount = StringHelper.getCharsCount(textParagraph);
    }

    @Then("I verify the words count is equal to {int}")
    public void iVerifyTheWordsCountIsEqualTo(int wordsCount) {
        Assertions.assertEquals(wordsCount, wordsCountFromText, "The word count is not as expected");
    }

    @Then("I verify the char count is equals to {int}")
    public void iVerifyTheCharCountIsEqualsTo(int expectedCharsCount) {
        Assertions.assertEquals(expectedCharsCount, charsCount, "The char count is not as expected");
    }


}
