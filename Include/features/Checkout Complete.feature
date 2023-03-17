@CheckoutComplete
Feature: Checkout Complete feature

  Background: 
    Given I open https://www.saucedemo.com/
    When I input valid standard_user and secret_sauce
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage
    When I click Add to Cart button
    Then I have been added product to cart
    And I see a product that has been added in the Cart
    And I click on the Checkout button
    Then I should be navigated to Checkout page
    When I input olivia, Rodrigo, and 12345 on the First Name, Last Name, and Postal Code field
    And I click on the Continue button
    Then I should be navigated to Checkout:Overview page
    When I click on the Finish button
    Then I should be navigated to Order Success page
    
   #PositiveTestCase
    @CO001
    Scenario: Back to Homepage
    When I click on the Back Home button
    Then I should be navigated to Home Page