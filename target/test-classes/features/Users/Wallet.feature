Feature: Wallet User
As a user
I want to top up balance
So I can manage my wallet


    Scenario: user top up balance
      Given I set url top up wallet
      When I get top up balance
      Then I will get status succes all top up balance

  Scenario: user get my wallet
    Given I set url top up wallet
    When I get my wallet
    Then I will get status succes my wallet

  Scenario: user get my wallet history
    Given I set url top up wallet
    When I get my wallet history
    Then I will get status succes my wallet history

  Scenario: user get my wallet cashin cashout
    Given I set url top up wallet
    When I get my wallet cashin cashout
    Then I will get status succes my wallet cashin cashout

  Scenario: user top up balance no token
    Given I set url top up wallet
    When I get top up balance no token
    Then I will get status failed a wallet

  Scenario: user get my wallet no token
    Given I set url top up wallet
    When I get my wallet no token
    Then I will get status failed a wallet

  Scenario: user get my wallet history no token
    Given I set url top up wallet
    When I get my wallet history no token
    Then I will get status failed a wallet

  Scenario: user get my wallet cashin cashout no token
    Given I set url top up wallet
    When I get my wallet cashin cashout no token
    Then I will get status failed a wallet
