@Cart
Feature: Cart feature

  Background: 
    Given I open https://www.saucedemo.com/
    When I input valid standard_user and secret_sauce
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage

  @PositiveTestCaseCart
  Scenario: Add to Cart from Homepage
    When I click Add to Cart button
    Then I have been added product to cart
    And I see a product that has been added in the Cart

  Scenario: View Cart Page Empty State
    When I click Cart icon
    Then I should be navigated to Cart Page

  @NegativeTestCaseCart
  Scenario: Delete Product to Cart
    When I click Add to Cart button
    Then I have been added product to cart
    And I see a product that has been added in the Cart
    When I click Cart icon
    And I click on the Remove button
    Then I should be unable to view product in the cart
    
