Feature: Product Admin
  As a admin
  I want to manage product
  So I can create a product

  Scenario: admin get all product
    Given I set url products
    When I get all product
    Then I will get status succes get all product

  Scenario: admin get a product by id
    Given I set url products
    When I get product by id
    Then I will get status succes get product by id

  Scenario: admin get all product no token
    Given I set url products
    When I get all product no token
    Then I will get status failed product

  Scenario: admin get a product by id no token
    Given I set url products
    When I get product by id no token
    Then I will get status failed product



