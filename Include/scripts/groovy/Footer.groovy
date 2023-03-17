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



class Footer {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I scroll to the Footer")
	public void I_scroll_to_the_Footer() {
		WebUI.scrollToElement(findTestObject('Object Repository/Footer/Footer'), 3)
	}
	
	@When("I click on the Facebook Icon")
	public void i_click_on_the_Facebook_Icon() {
		WebUI.click(findTestObject('Object Repository/Footer/Link_Facebook'))
	}
	
	@Then("I should be navigated to Facebook Website")
	public void i_should_be_navigated_to_Facebook_Website() {
		WebUI.navigateToUrl('https://web.facebook.com/saucelabs?_rdc=1&_rdr')
		WebUI.verifyElementVisible(findTestObject('Object Repository/Footer/Facebook_Header'))
	}
	
	@When("I click on the Twitter Icon")
	public void i_click_on_the_Twitter_Icon() {
		WebUI.click(findTestObject('Object Repository/Footer/Link_Twitter'))
	}
	
	@Then("I should be navigated to Twitter Website")
	public void i_should_be_navigated_to_Twitter_Website() {
		WebUI.navigateToUrl('https://twitter.com/saucelabs')
		WebUI.verifyElementVisible(findTestObject('Object Repository/Footer/Twitter_ID'))
	}
	
	@When("I click on the LinkedIn Icon")
	public void i_click_on_the_LinkedIn_Icon() {
		WebUI.click(findTestObject('Object Repository/Footer/Link_LinkedIn'))
	}
	
	@Then("I should be navigated to LinkedIn Website")
	public void i_should_be_navigated_to_LinkedIn_Website() {
		WebUI.navigateToUrl('https://www.linkedin.com/company/sauce-labs/?original_referer=')
		WebUI.verifyElementVisible(findTestObject('Object Repository/Footer/SignIn Popup_LinkedIn'))
	}
}