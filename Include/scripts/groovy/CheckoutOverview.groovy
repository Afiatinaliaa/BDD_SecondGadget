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



class CheckoutOverview {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I click on the Finish button")
	public void i_click_on_the_Finish_button() {
		WebUI.click(findTestObject('Object Repository/Checkout Overview/Button_Finish'))
	}
	
	@Then("I should be navigated to Order Success page")
	public void i_should_be_navigated_to_Order_Success_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout Complete/Text_Succes Order'))
	}
	
	@When("I click Cancel button on the Checkout Overview")
	public void i_click_Cancel_button_on_the_Checkout_Overview() {
		WebUI.click(findTestObject('Object Repository/Checkout Overview/Button_Cancel'))
	}
	
	@Then("I should be navigated to SwagLabs Homepage")
	public void i_should_be_navigated_to_SwagLabs_Homepage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/Button_Filter'))
	}
}