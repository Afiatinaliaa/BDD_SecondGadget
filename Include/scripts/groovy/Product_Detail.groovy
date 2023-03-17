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



class Product_Detail {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I click on the Product Name")
	public void i_click_on_the_Product_Name() {
		WebUI.click(findTestObject('Object Repository/Homepage/Text Link_Product Name'))
	}

	@Then("I should be navigated to Product Detail page")
	public void i_should_be_navigated_to_Product_Detail_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Product/Img_Product'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Product/Text_Product Name'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Product/Text_Product Desc'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Product/Button_Back to products'))
	}

	@When("I click on the Cart icon Empty")
	public void i_click_on_the_Cart_icon_Empty() {
		WebUI.click(findTestObject('Object Repository/Detail Product/Link_CartEmpty'))
	}

	@When("I click on the Cart icon")
	public void i_click_on_the_Cart_icon() {
		WebUI.click(findTestObject('Object Repository/Detail Product/Link_Cartfilled'))
	}

	@Then("I should be navigated to Cart page")
	public void i_should_be_navigated_to_Cart_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/button_Continue Shopping'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/button_Checkout'))
	}

	@Then("I should be unable to see product in the Cart page")
	public void i_should_be_unable_to_see_product_in_the_Cart_page() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart/List_Product'), 20)
	}

	@When("I click on the Add to Cart button")
	public void i_click_on_the_Add_to_Cart_button() {
		WebUI.click(findTestObject('Object Repository/Detail Product/Button_Add to cart'))
	}

	@Then("I successfully added product to Cart")
	public void i_successfully_added_product_to_Cart() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Product/Link_Cartfilled'))
	}

	@Then("I see product in the Cart page")
	public void i_see_product_in_the_Cart_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/List_Product'))
	}

	@When("I click on the Back to Product button")
	public void i_click_on_the_Back_to_Product_button() {
		WebUI.click(findTestObject('Object Repository/Detail Product/Button_Back to products'))
	}

	@Then("I should be navigated to Homepage")
	public void i_should_be_navigated_to_Homepage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/Button_Filter'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/Button_Menu'))
	}

	@When("I click on the Remove button on the Product Detail")
	public void i_click_on_the_Remove_button_on_the_Product_Detail() {
		WebUI.click(findTestObject('Object Repository/Detail Product/Button_Remove'))
	}

	@Then("I successfully remove product from cart")
	public void i_successfully_remove_product_from_cart() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Cart/List_Product'), 20)
	}
}