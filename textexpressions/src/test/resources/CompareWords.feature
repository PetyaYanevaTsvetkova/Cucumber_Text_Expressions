# tests created by: Petyq Yaneva-Tsvetkova

@CompareWords
Feature:test the areWordsEqual() method

  Background:
    * stringHelper case sensitive is set on: false


    Scenario: Test if two words are equals
      Given First word input is Cucumber
      When Second word input cucumkber
      Then Verification if the words are equal
