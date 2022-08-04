Feature: Login Test
  As user I want to login into  iPlato website

  @Smoke
  Scenario: User should not able to signIn with invalid credentials.
    Given I am on homepage
    When I click on Sign in link
    And I enters 'username' with "admin"
    And I enters 'password' with "iPlato@1234"
    And I click on login button
    Then Error message displayed with wrong username or password

