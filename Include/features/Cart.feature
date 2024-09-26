@Cart
Feature: Cart feature


  Scenario Outline: Login
    When I have logged in to website

  #PositiveTestCaseCart
  @CR001
  Scenario: View Cart Page Empty State
    When I click Cart icon
    Then I should be navigated to Cart Page
    
  @CR002
  Scenario: Add to Cart from Homepage
    When I click Continue Shopping button
    And I click Add to Cart button
    Then I have been added product to cart
    And I see a product that has been added in the Cart

  @CR003 @requiresLogin
  Scenario: Continue Checkout
    When I click Cart icon
    And I click on the Checkout button
    Then I should be navigated to Checkout page
    

  #NegativeTestCaseCart
  @CR003
  Scenario: Delete Product to Cart
    When I click on the Cancel button
    And I click on the Remove button
    Then I should be unable to view product in the cart
