Feature: Product User
  As a user
  I want to get a product
  So I can view a all product

  Scenario: user get all product
    Given I set url product
    When I get all user product
    Then I will get status succes get user product

  Scenario: user get product by id
    Given I set url product
    When I get user product by id
    Then I will get status succes get user product by id

  Scenario: user get product no token
    Given I set url product
    When I get user product no token
    Then I will get status failed get a product

  Scenario: user get product by id no token
    Given I set url product
    When I get user product by id no token
    Then I will get status failed get a product