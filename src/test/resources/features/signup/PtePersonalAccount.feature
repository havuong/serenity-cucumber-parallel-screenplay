@SignUp @PtePersonal
Feature: Sign up with pte personal account

  @Smoke @Regression
  Scenario Outline: TS002-01-Sign up with pte personal account
    Given User is opening Liquid home page
    And User sees the landing page
    And User clicks on sign up link on the footer
    And User sees the sign up screen
    When User selects a random country
    And User clicks on next button on sign up screen
    And User selects "<account_type>" for sign up
    And User enters email, and password
    And User enters pte personal user information
    And User clicks on next button on sign up screen
    And User checks on term and subscribe checkboxes base on a random country
    And User clicks on next button on sign up screen
    Then User will see thank you pop-up
    Examples:
      | account_type |
      | individual   |