Feature: Logout
  As a user
  I want to logout
  So I can logout dashbord


  Scenario: logout with valid token
    Given I set url logout
    When I input token
    Then I will get status succes logout

  Scenario: logout with invalid token
    Given I set url logout
    When I input invalid token
    Then I will get status failed logout

  Scenario: logout with null token
    Given I set url logout
    When I input no token
    Then I will get status failed logout 400
