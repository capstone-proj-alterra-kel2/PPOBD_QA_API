Feature: Wallet Admin
  As a admin
  I want to manage Wallet
  So I get all Wallet

  Scenario: admin get All Wallet
    Given I set url Wallet
    When I get Wallet all
    Then I will get status succes get Wallet all

  Scenario: admin get a Wallet by id
    Given I set url Wallet
    When I get Wallet by id wrong
    Then I will get status failed get Wallet by id

  Scenario: admin get All Wallet no token
    Given I set url Wallet
    When I get Wallet all no token
    Then I will get status failed get Wallet all

  Scenario: admin get a Wallet by id no token
    Given I set url Wallet
    When I get Wallet by id no token
    Then I will get status failed get Wallet
