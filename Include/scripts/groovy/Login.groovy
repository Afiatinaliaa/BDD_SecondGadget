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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I open https://www.saucedemo.com/")
	def I_open_https_www_saucedemo_com() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
	}

	@When("I input invalid (.*) and (.*)")
	def I_input_invalid_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Login Page/Text Field_Username'), username)
		WebUI.setText(findTestObject('Object Repository/Login Page/Text Field_Password'), password)
	}

	@And("I click on the Login button")
	def I_click_on_the_Login_button() {
		WebUI.click(findTestObject('Object Repository/Login Page/Button_Login'))
	}

	@Then ("I should be failed to login")
	def I_should_be_failed_to_login() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login Page/Alert_Failed Login'), 15)
	}

	@When("I input valid (.*) and (.*)")
	def I_input_valid_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Login Page/Text Field_Username'), username)
		WebUI.setText(findTestObject('Object Repository/Login Page/Text Field_Password'), password)
	}

	@Then("I should be navigated to SwagLabs homepage")
	def I_should_be_navigated_to_SwagLabs_homepage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Icon Link_Cart'), 15)
	}
}