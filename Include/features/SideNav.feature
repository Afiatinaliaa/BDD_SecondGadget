@SideNav
Feature: Side Navigation feature

  Background: 
    Given I open https://www.saucedemo.com/
    When I input valid standard_user and secret_sauce
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage

  #PositiveTestCase
  @SN001
  Scenario: View About Menu
    When I click on the Burger button
    And I click on the About Menu
    Then I should be navigated to https://saucelabs.com/

  @SN002
  Scenario: View Logout Menu
    When I click on the Burger button
    And I click on the Logout Menu
    Then I should be logout successfully

  #NegativeTestCase
  @SN003
  Scenario: Close Side Navigation
    When I click on the Burger button
    And I click on the close button
    Then I successfully close Side Navigation
