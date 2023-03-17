@Footer
Feature: Footer feature

  Background: 
    Given I open https://www.saucedemo.com/
    When I input valid standard_user and secret_sauce
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage

  #PositiveTestCase
  @FT001
  Scenario: View Facebook on the Footer
    When I scroll to the Footer
    And I click on the Facebook Icon
    Then I should be navigated to Facebook Website

  @FT002
  Scenario: View Twitter on the Footer
    When I scroll to the Footer
    And I click on the Twitter Icon
    Then I should be navigated to Twitter Website

  @FT003
  Scenario: View LinkedIn on the Footer
    When I scroll to the Footer
    And I click on the LinkedIn Icon
    Then I should be navigated to LinkedIn Website
