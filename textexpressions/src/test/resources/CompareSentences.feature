# tests created by: Petyq Yaneva-Tsvetkova
  @CompareSentences
Feature:  test the areSentencesEqual() method from StringHelper class

  Background:
   Given case sensitive is set on: true

    Scenario: test two sentences
      Given First sentence is I set the sentence to Cucumber is amazing!
      When Second sentence is I set the sentence to cucumber is amazing!
      Then Verify if sentences are equal