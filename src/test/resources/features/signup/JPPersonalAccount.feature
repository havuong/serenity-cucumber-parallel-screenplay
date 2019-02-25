@SignUp @JPPersonal
Feature: Sign up with jp personal account

  Scenario Outline: TS002-03-Sign up with jp personal account
    Given User is opening Liquid home page
    And User sees the landing page
    And User clicks on sign up link on the footer
    And User sees the sign up screen
    When User selects "<country_of_residence>"
    And User clicks on next button on sign up screen
    And User selects "<account_type>" for sign up
    And User enters email, and password
    And User checks on confirming JP and US checkboxes
    And User enters jp personal user information
    And User enters contact information
    And User selects their professional information
    And User selects financial information of "<account_type>"
    And user checks on investment objective of "<account_type>"
    And User selects investment experience of "<account_type>"
    And User clicks on next button on sign up screen
    And User checks on term and subscribe checkboxes base on "<country_of_residence>"
    And User clicks on next button on sign up screen
    Then User will see thank you pop-up
    Examples:
      | country_of_residence | account_type |
      | JP                   | individual   |