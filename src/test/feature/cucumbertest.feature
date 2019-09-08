#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: testing|
  I want to use this template for my feature file

  @tag1
  Scenario: I want to login
    Given Here we are on login page
    And i Enter username as"testuser"
    And i Enter password as"Password01"
    Then I am logged in 

  @tag2
  Scenario Outline: login via example
     Given Here we are on login 
    And i Enter username "<username>"
    And i Enter password "<pswd>"
    Then I am log in 

    Examples: 
      | username|pswd      |
      |testuser |Password01|
