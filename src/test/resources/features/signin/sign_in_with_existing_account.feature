Feature: Sign in with an existing account
  As a customer with a login account
  user should be able to sign in with account credentials
  to make an order
  and access their order history

  Scenario: TS001-01-Sign in with valid user account
    Given that Mary is a registered PTE
#    When User inputs valid email and password of "<User>" "<Country>" user
    When she logs in with valid credentials
      | username                 | password       |
      | pte_personal@yopmail.com | Testing@123456 |
    Then she should be able to view home page
