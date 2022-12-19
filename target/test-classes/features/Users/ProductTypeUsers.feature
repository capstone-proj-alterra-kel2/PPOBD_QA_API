Feature: Product Type User
  As a user
  I want to get a product by id
  So I can view a all product type


  Scenario: user product type
    Given I set url product type
    When I get product by type
    Then I will get status succes product by type

  Scenario: user get product type by id
    Given I set url product type
    When I get product type by id
    Then I will get status succes product by type