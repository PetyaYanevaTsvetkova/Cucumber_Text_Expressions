package stepDefinishions;

import helper.StringHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CompareWordsSteps {
    private boolean isCaseSensitive;
    private String firstWord;
    private String secondWord;


    @ParameterType("true|false")
    public boolean aBoolean(String booleanInput) {
        boolean b = Boolean.parseBoolean(booleanInput);
        return b;
    }

    @Given("stringHelper case sensitive is set on: {aBoolean}")
    public void caseSensitiveIsSetOn(boolean aBoolean) {
        isCaseSensitive = aBoolean;
    }

    @Given("First word input is {word}")
    public void firstWordInputIsCucumber(String word) {
        firstWord = word;
    }

    @When("Second word input {word}")
    public void secondWordInputCucumber(String word) {
        secondWord = word;
    }

    @Then("Verification if the words are equal")
    public void verificationOfTheWordsAreEqual() {
        if (isCaseSensitive) {
            System.out.println("The words are not equal");
            Assertions.assertFalse(StringHelper.areWordsEqual(firstWord, secondWord, isCaseSensitive),
                    "Test fails because the words are equal:" + firstWord + " " + secondWord);
        } else {
            System.out.println("Words are equal");
            Assertions.assertTrue(StringHelper.areWordsEqual(firstWord, secondWord, isCaseSensitive));
        }
    }
}
