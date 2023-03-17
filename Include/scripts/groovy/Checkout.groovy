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



class Checkout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I input (.*), (.*), and (.*) on the First Name, Last Name, and Postal Code field")
	public void i_input_firstname_lastname_and_postalcode_on_the_First_Name_field(String firstname, String lastname, String postalcode) {
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Firstname'), firstname)
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_lastname'), lastname)
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Postalcode'), postalcode)
	}

	@When("I click on the Continue button")
	public void i_click_on_the_Continue_button() {
		WebUI.click(findTestObject('Object Repository/Checkout/Button_Continue'))
	}

	
	@Then("I should be navigated to Checkout:Overview page")
	public void i_should_be_navigated_to_Checkout_Overview_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout Overview/Button_Finish'))
	}

	
	@When("I input (.*) and (.*) on the Last Name and Postal Code field")
	public void i_input_lastname_and_postalcode_on_the_Last_Name_and_Postal_Code_field(String lastname, String postalcode) {
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_lastname'), lastname)
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Postalcode'), postalcode)
	}
	
	@Then("I should be able to see error message First Name is Required")
	public void i_should_be_able_to_see_error_message_First_Name_is_Required() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Alert_First Name is required'))
	}
	
	@When("I input (.*) and (.*) on the First Name and Postal Code field")
	public void i_input_firstname_and_postalcode_on_the_First_Name_and_Postal_Code_field(String firstname, String postalcode) {
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Firstname'), firstname)
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Postalcode'), postalcode)
	}
	
	@Then("I should be able to see error message Last Name is Required")
	public void i_should_be_able_to_see_error_message_Last_Name_is_Required() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Alert_Last Name is required'))
	}
	
	@When("I input (.*) and (.*) on the First Name and Last Name field")
	public void i_input_firstname_and_lastname_on_the_First_Name_and_Last_Name_field(String firstname, String lastname) {
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Firstname'), firstname)
		WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_lastname'), lastname)
	}
	
	@Then("I should be able to see error message Postal Code is Required")
	public void i_should_be_able_to_see_error_message_Postal_Code_is_Required() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Alert_Postal Code is required'))
	}
	
	@When("I click on the Cancel button")
	public void i_click_on_the_Cancel_button() {
		WebUI.click(findTestObject('Object Repository/Checkout/Button_Cancel'))
	}
	
	@Then("I should be navigated to cart page")
	public void i_should_be_navigated_to_cart_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Cart/button_Checkout'))
	}
}