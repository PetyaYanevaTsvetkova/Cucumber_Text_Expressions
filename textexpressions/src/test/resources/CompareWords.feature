# tests created by: Petyq Yaneva-Tsvetkova

@CompareWords
Feature:test the areWordsEqual() method

 # Background:
  #  * stringHelper case sensitive is set on: true


    Scenario: Test if two words are equals
      Given First word input is Cucumber
      When Second word input cucumber
      Then Verification if the words are equal
