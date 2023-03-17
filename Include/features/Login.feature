@Login
Feature: Login Feature
  I want to login

  @NegativeTestCase
  Scenario Outline: Login using invalid Credential
    Given I open https://www.saucedemo.com/
    When I input invalid <username> and <password>
    And I click on the Login button
    Then I should be failed to login

    Examples: 
      | username  | password     |
      | test_user | secret_sauce |

  @PositiveTestCase
  Scenario Outline: Login using Valid Credential
    Given I open https://www.saucedemo.com/
    When I input valid <username> and <password>
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
