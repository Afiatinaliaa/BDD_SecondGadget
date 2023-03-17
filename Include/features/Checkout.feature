@Checkout
Feature: Checkout feature

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

  #PositiveTestCase
  @CYI001
  Scenario Outline: Complete input all information on the Checkout:Your Information page
    When I input <firstname>, <lastname>, and <postalcode> on the First Name, Last Name, and Postal Code field
    And I click on the Continue button
    Then I should be navigated to Checkout:Overview page

    Examples: 
      | firstname | lastname | postalcode |
      | olivia    | Rodrigo  |      12345 |

  #NegativeTestCase
  @CYI002
  Scenario Outline: Doesnt input First Name field
    When I input <lastname> and <postalcode> on the Last Name and Postal Code field
    And I click on the Continue button
    Then I should be able to see error message First Name is Required
    
    Examples: 
      | lastname | postalcode |
     	| Rodrigo  |      12345 |
    

  @CYI003
  Scenario Outline: Doesnt input Last Name field
    When I input <firstname> and <postalcode> on the First Name and Postal Code field
    And I click on the Continue button
    Then I should be able to see error message Last Name is Required
    
    Examples: 
      | firstname | postalcode |
      | olivia    |      12345 |

  @CYI004
  Scenario Outline: Doesnt input Postal Code field
    When I input <firstname> and <lastname> on the First Name and Last Name field
    And I click on the Continue button
    Then I should be able to see error message Postal Code is Required
    
    Examples: 
      | firstname | lastname |
      | olivia    | Rodrigo  |

  @CYI005
  Scenario: Doesnt input All field on the Checkout:Your Information page
    When I click on the Continue button
    Then I should be able to see error message First Name is Required

  @CYI006
  Scenario Outline: Cancel checkout
    When I input <firstname>, <lastname>, and <postalcode> on the First Name, Last Name, and Postal Code field
    And I click on the Cancel button
    Then I should be navigated to cart page
    
    Examples: 
      | firstname | lastname | postalcode |
      | olivia    | Rodrigo  |      12345 |
