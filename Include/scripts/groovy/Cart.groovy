import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as object



class Cart {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I have logged in to website")
	def I_have_logged_in_to_website() {
		WebUI.callTestCase(findTestCase('Include/features/Login.feature'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I click Cart icon")
	def I_click_Cart_icon() {
		WebUI.click(findTestObject('Object Repository/Homepage/Icon Link_Cart'))
	}
	@When("I click Continue Shopping button")
	def I_click_Continue_Shopping_button() {
		WebUI.click(findTestObject('Object Repository/Cart/button_Continue Shopping'))
	}
	@When("I click Add to Cart button")
	def I_click_Add_to_Cart_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/Button_Add to Cart'))
	}
	@Then("I have been added product to cart")
	def I_have_been_added_product_to_cart() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/Button_Remove Backpack'))
	}
	@When("I see a product that has been added in the Cart")
	def I_see_a_product_that_has_been_added_in_the_Cart() {
		WebUI.click(findTestObject('Object Repository/Homepage/Icon Link_Cart'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/Badge'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/List_Product'))
	}
	@When("I click on the Checkout button")
	def I_click_on_the_Checkout_button() {
		WebUI.click(findTestObject('Object Repository/Cart/button_Checkout'))
	}
	@When("I click on the Cancel button")
	def I_click_on_the_Cancel_button() {
		WebUI.click(findTestObject('Object Repository/Checkout/Button_Cancel'))
	}
	@When("I click on the Remove button")
	def I_click_on_the_Remove_button() {
		WebUI.click(findTestObject('Object Repository/Cart/Button_Remove Product'))
	}
	@Then("I should be navigated to Cart Page")
	def I_should_be_navigated_to_Cart_Page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/button_Continue Shopping'))
	}
	@Then("I should be navigated to Checkout page")
	def I_should_be_navigated_to_Checkout_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Text_Checkout Your Info'))
	}
	@Then("I should be unable to view product in the cart")
	def I_should_be_unable_to_view_product_in_the_cart( ) {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart/List_Product'), 30)
	}
}