@Login
Feature: Login Feature
  I want to login

  @NegativeTestCase
  Scenario Outline: Login with empty username
    Given I have opened https://www.saucedemo.com/
    When I input valid password <password>
    And I click on the Login button
    Then I should be viewed username required alert

    Examples: 
      | password     |
      | secret_sauce |
      
  Scenario Outline: Login with empty password
    Given I input valid username <username>
    When I have cleared text on the password field
    And I click on the Login button
    Then I should be viewed password required alert

    Examples: 
      | username  |
      | standard_user |
      
  Scenario Outline: Login with invalid Credential
    Given I have cleared text on the username
    When I input invalid <username> and <password>
    And I click on the Login button
    Then I should be failed to login

    Examples: 
      | username  | password     |
      | new_user  | public_sauce |
      

  @PositiveTestCase
  Scenario Outline: Login using Valid Credential
    Given I have cleared text on the username and password
    When I input valid <username> and <password>
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
