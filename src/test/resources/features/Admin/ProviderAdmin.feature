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



