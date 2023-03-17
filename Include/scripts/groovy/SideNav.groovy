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



class SideNav {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I click on the Burger button")
	public void i_click_on_the_Burger_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/Button_Menu'))
	}

	@When("I click on the About Menu")
	public void i_click_on_the_About_Menu() {
		WebUI.click(findTestObject('Object Repository/Side Navigation/Menu_About'))
	}

	@Then("I should be navigated to https://saucelabs.com/")
	public void i_should_be_navigated_to_https_saucelabs_com() {
		WebUI.navigateToUrl('https://saucelabs.com/')
		WebUI.verifyElementVisible(findTestObject('Object Repository/Side Navigation/Img_SauceLabs'))
	}

	@When("I click on the Logout Menu")
	public void i_click_on_the_Logout_Menu() {
		WebUI.click(findTestObject('Object Repository/Side Navigation/Menu_Logout'))
	}

	@Then("I should be logout successfully")
	public void i_should_be_logout_successfully() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Text Field_Username'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Text Field_Password'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Button_Login'))
	}

	@When("I click on the close button")
	public void i_click_on_the_close_button() {
		WebUI.click(findTestObject('Object Repository/Side Navigation/Button_Close'))
	}

	@Then("I successfully close Side Navigation")
	public void i_successfully_close_Side_Navigation() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/Button_Menu'))
	}
}