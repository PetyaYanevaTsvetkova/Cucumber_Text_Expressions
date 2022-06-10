## Project's Title:
	Cucumber: Text Expressions

## Project Description:
		
	Theory:

	Cucumber Expressions to capture text - {word} and {string}
	Alternative text
	Creating step definitions with Java Lambda expression 

	Practical tasks:

	Compare words
	Description:  Implement Cucumber Data Driven scenarios that test the areWordsEqual() method from the attached StringHelper class. Case sensitivity should be set in a background step.  First word input, second word input and the verification of the output should be 3 different steps. 
	Example test flow:
	First word is Cucumber
	Second word is cucumber
	I verify words are equal (test passes if case-sensitivity is off or fails if it’s on)

	Compare sentences
	Description: Implement a Cucumber scenarios that test the areSentencesEqual() method from the attached StringHelper class. Case sensitivity should be set in a background step.  First sentence input, second sentence input and the verification of the output should be 3 different steps. 
	Example test flow:
	I set the first sentence to Cucumber is amazing!
	I set the second sentence to cucumber is amazing!
	I verify sentences are equal (test passes if case-sensitivity is off or fails if it’s on)

	Word and char count
	Description: Implement a Scenario that gives you the word and char count of a text. 
	Use the attached StringHelper and implement a step that accepts a paragraph of text as an input. 
	Implement steps that verify the output
	Example test flow:
	I pass the following text: Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
	sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, 
	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
	Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
	Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est  laborum.
	I get the word (or the char) count
	I verify the count is equal to 70

	Acceptance criteria:
	Test scenarios are running and are implemented as per definitions above.
	Trainee understands and is has used Text expressions and alternative text in the implemented step definitions using Java Lambdas
	Only specific group or sub-group (suite) of tests can be executed through a JUnit Cucumber Test Runner class

## Table of Contents:
	textexpressions
	lambdas
	README.md file
	.gitignore file
	

## How to Install and Run the Project:
	IDE need to execute the java project
	 
## How to Use the Project:
	Maven need

## Useful links:
	https://github.com/cucumber/cucumber-expressions

## Add a License
	no needed


