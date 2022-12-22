Feature: Category User
  As a user
  I want to get a Category product
  So I can view a Category product

  Scenario: user a get Category product
    Given I set url category product
    When I get a category product
    Then I will get status succes get a category product

  Scenario: user a get Category product by id
    Given I set url category product
    When I get a category product by id
    Then I will get status succes get a category product by id

  Scenario: user a get Category product no token
    Given I set url category product
    When I get a category product no token
    Then I will get status failed get a category product

