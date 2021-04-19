
Feature: Validate the product price for a full special support plan for 6 months simulation
  Scenario: Validate price
    Given I navigate to web page
    And I click Type drop down
    And I click Special
    And I click Support Plan drop down
    And I click Full
    And I click Monthly duration
    And I enter 6
    And I click calculate
    Then Summary should be displayed