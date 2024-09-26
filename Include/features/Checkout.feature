@Checkout
Feature: Checkout feature

	# Background: Digunakan untuk mengatur langkah-langkah yang selalu dijalankan sebelum setiap skenario
  @Before
  Scenario: Login
    Given I open https://www.saucedemo.com/
    When I input valid standard_user and secret_sauce
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage

  # Hook @Before: Digunakan untuk skenario yang memerlukan produk di keranjang
  @Before @requiresLogin
  Scenario: Cart
    When I click Add to Cart button
    Then I have been added product to cart
    And I see a product that has been added in the Cart

  #NegativeTestCase
  @CYI002 @requiresCart
  Scenario Outline: Doesnt input First Name field
    When I click Checkout button on the cart page
    And I input <lastname> and <postalcode> on the Last Name and Postal Code field
    And I click on the Continue button
    Then I should be able to see error message First Name is Required
    
    Examples: 
      | lastname | postalcode |
     	| Rodrigo  |      12345 |
    

  @CYI003 @requiresCart
  Scenario Outline: Doesnt input Last Name field
    When I clear on the Last Name field
    And I input <firstname> and <postalcode> on the First Name and Postal Code field
    And I clear on the Last Name field
    And I click on the Continue button
    Then I should be able to see error message Last Name is Required
    
    Examples: 
      | firstname | postalcode |
      | olivia    |      12345 |

  @CYI004 @requiresCart
  Scenario Outline: Doesnt input Postal Code field
    When I clear on the Postal Code field 
    And I input <firstname> and <lastname> on the First Name and Last Name field
    And I click on the Continue button
    Then I should be able to see error message Postal Code is Required
    
    Examples: 
      | firstname | lastname |
      | olivia    | Rodrigo  |

  @CYI005 @requiresCart
  Scenario: Doesnt input All field on the Checkout:Your Information page
    When I clear on the First Name Field
    And I clear Last Name Field
    And I click on the Continue button
    Then I should be able to see error message First Name is Required

  @CYI006 @requiresCart
  Scenario Outline: Cancel checkout
    When I input <firstname>, <lastname>, and <postalcode> on the First Name, Last Name, and Postal Code field
    And I click on the Cancel button CO
    Then I should be navigated to cart page
    
    Examples: 
      | firstname | lastname | postalcode |
      | olivia    | Rodrigo  |      12345 |
      
  #PositiveTestCase
  @CYI001 @requiresCart
  Scenario Outline: Complete input all information on the Checkout:Your Information page
    When I input <firstname>, <lastname>, and <postalcode> on the First Name, Last Name, and Postal Code field
    And I click on the Continue button
    Then I should be navigated to Checkout:Overview page

    Examples: 
      | firstname | lastname | postalcode |
      | olivia    | Rodrigo  |      12345 |
    
