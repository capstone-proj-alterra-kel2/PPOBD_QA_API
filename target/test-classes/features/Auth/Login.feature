Feature: Login
  As a user
  I want to login
  So I can view dashbord


  Scenario: login with email password valid
    Given I set url login
    When I input email password
    Then I will get status succes

  Scenario: login with email valid and no password
    Given I set url login
    When I input email
    Then I will get status validation failed

  Scenario: login with password valid and no email
    Given I set url login
    When I input password
    Then I will get status validation failed

  Scenario: login with null data
    Given I set url login
    When I input null data
    Then I will get status validation failed

  Scenario: login with email and password invalid
    Given I set url login
    When I input email and password invalid
    Then I will get status validate Eror Message

  Scenario: login with email valid and password invalid
    Given I set url login
    When I input email valid and password invalid
    Then I will get status validate Eror Message

  Scenario: login with email invalid and password valid
    Given I set url login
    When I input email invalid and password valid
    Then I will get status validate Eror Message