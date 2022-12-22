Feature: Transaction User
  As a user
  I want to buy the item
  So I get pay the item


  Scenario: user buy the item
    Given I set url user transaction
    When I get create a transaction
    Then I will get status succes a transaction

  Scenario: user view the history
    Given I set url user transaction
    When I get Transaction history
    Then I will get status succes Transaction

  Scenario: user buy the item no token
    Given I set url user transaction
    When I get create a transaction no token
    Then I will get status failed transaction

  Scenario: user view the history no token
    Given I set url user transaction
    When I get Transaction history no token
    Then I will get status failed transaction