@ProductDetail
Feature: Product Detail feature

  #@Before 
  #Scenario Outline: Login Feature
  #	Given I open https://www.saucedemo.com/
  #	When I input valid <username> and <password>
  #	And I click on the Login button
  #	Then I should be navigated to SwagLabs homepage
    #
    #Examples:
      #| username      | password     |
      #| standard_user | secret_sauce |
      
  #Positive_Test_Case
  @PD001 @requiresLogin
  Scenario: View Product Detail
  When I click on the Product Name
  Then I should be navigated to Product Detail page
  
  @PD002 @requiresLogin
  Scenario: VView Cart page through Product Detail (Empty State)
  When I click on the Product Name
  Then I should be navigated to Product Detail page
  When I click on the Cart icon Empty
  Then I should be navigated to Cart page
  And I should be unable to see product in the Cart page
  
  @PD003 @requiresLogin
  Scenario: Add product to Cart through Product Detail page
  When I click on the Product Name
  Then I should be navigated to Product Detail page
  When I click on the Add to Cart button
  Then I successfully added product to Cart
  
  @PD004 @requiresLogin
  Scenario: View Cart page through Product Detail
  When I click on the Product Name
  Then I should be navigated to Product Detail page
  When I click on the Add to Cart button
  Then I successfully added product to Cart
  When I click on the Cart icon
  Then I should be navigated to Cart page
  And I see product in the Cart page
  
  #Negative_Test_Case
  @PD005 @requiresLogin
  Scenario: Back to Homepage
  When I click on the Product Name
  Then I should be navigated to Product Detail page
  When I click on the Add to Cart button
  Then I successfully added product to Cart
  When I click on the Back to Product button
  Then I should be navigated to Homepage
  
  @PD006 @requiresLogin
  Scenario: Cancel Add Product to Cart
  When I click on the Product Name
  Then I should be navigated to Product Detail page
  When I click on the Add to Cart button
  Then I successfully added product to Cart
  When I click on the Remove button on the Product Detail
  And I click on the Cart icon Empty
  Then I successfully remove product from cart
  
  
  