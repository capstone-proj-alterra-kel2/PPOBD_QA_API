Feature: Register
  As a user
  I want to register
  So I can create my account


  Scenario: Register with name phone_number email password
    Given I set url register
    When I input name phone_number email password
    Then I will get status code 201 create

  Scenario: Register with phone_number email password
    Given I set url register
    When I input phone_number email password
    Then I will get status code 400 Bad Request

  Scenario: Register with name email password
    Given I set url register
    When I input name email password
    Then I will get status code 400 Bad Request

  Scenario: Register with name phone_number password
    Given I set url register
    When I input name phone_number password
    Then I will get status code 400 Bad Request

  Scenario: Register with name phone_number email
    Given I set url register
    When I input name  phone_number email
    Then I will get status code 400 Bad Request

  Scenario: Register with no data
    Given I set url register
    When I input no data
    Then I will get status code 400 Bad Request

  Scenario: Register with register account
    Given I set url register
    When I input register account
    Then I will get status code 400 Bad Request