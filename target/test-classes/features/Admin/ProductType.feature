Feature: Product Type Admin
  As a admin
  I want to manage Product Type
  So I can create a Product Type


  Scenario: admin get all Product Type
    Given I set url Product Type
    When I get all Product Type
    Then I will get status succes get all Product Type

  Scenario: admin get a Product Type by Id
    Given I set url Product Type
    When I get Product Type by id
    Then I will get status succes get Product Type by id

  Scenario: admin get all Product Type no token
    Given I set url Product Type
    When I get all Product Type no token
    Then I will get status failed get all Product Type

  Scenario: admin get a Product Type by Id no token
    Given I set url Product Type
    When I get Product Type by id no token
    Then I will get status failed get Product


