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
    When I get Wallet by id
    Then I will get status succes get Wallet by id
