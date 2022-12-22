Feature: Provider Admin
  As a admin
  I want to manage Provider
  So I can create a Provider


  Scenario: admin get all Provider
    Given I set url Provider
    When I get all Provider
    Then I will get status succes get all Provider

  Scenario: admin get a Provider by id
    Given I set url Provider
    When I get Provider by id
    Then I will get status succes get Provider by id

  Scenario: admin get all Provider no token
    Given I set url Provider
    When I get all Provider no token
    Then I will get status failed get all Provider

  Scenario: admin get a Provider by id no token
    Given I set url Provider
    When I get Provider by id no token
    Then I will get status failed get Provider



