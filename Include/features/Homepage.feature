@Homepage
Feature: Homepage feature

  Background: 
    Given I open https://www.saucedemo.com/
    When I input valid standard_user and secret_sauce
    And I click on the Login button
    Then I should be navigated to SwagLabs homepage
    
	#PositiveTestCase
	@HP001
	Scenario: Filter Product based on ASC
	When User click on the Filter dropdwon
	And User click on the "Name (A to Z)" filter
	Then System should be sort product list based on ASC
	
	@HP002
	Scenario: Filter Product based on DESC
	When User click on the Filter dropdwon
	And User click on the "Name (Z to A)" filter
	Then System should be sort product list based on DESC
	
	@HP003
	Scenario: Filter Product based on the cheapest
	When User click on the Filter dropdwon
	And User click on the "Price (Low to High)" filter
	Then System should be sort product list based on the cheapest
	
	@HP004
	Scenario: Filter Product based on the most expensive
	When User click on the Filter dropdwon
	And User click on the "Price (High to Low)" filter
	Then System should be sort product list based on the most expensive
	
	@HP005
	Scenario: Add to Cart from Homepage
	When User click on the Filter dropdwon
	And User click on the "Price (Low to High)" filter
	Then System should be sort product list based on the cheapest
	
	@HP006
	Scenario: Remove product from cart through Homepage
	When User click on the Filter dropdwon
	And User click on the "Price (Low to High)" filter
	Then System should be sort product list based on the cheapest