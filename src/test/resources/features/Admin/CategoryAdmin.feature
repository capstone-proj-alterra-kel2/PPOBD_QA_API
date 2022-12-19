Feature: Category Admin
  As a admin
  I want to manage Category
  So I can create a Category


  Scenario: admin get all Category
    Given I set url Category
    When I get all Category
    Then I will get status succes get all Category

  Scenario: admin get a Category id
    Given I set url Category
    When I get Category id
    Then I will get status succes get Category id



