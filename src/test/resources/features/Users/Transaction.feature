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