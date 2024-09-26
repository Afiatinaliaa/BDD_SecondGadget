import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Precondition
WebUI.callTestCase(findTestCase('Test Cases/Cart/TCP_View Cart Page (Single Product)'), [:], FailureHandling.STOP_ON_FAILURE)

//Checkout without input first name field

WebUI.click(findTestObject('Object Repository/Cart/button_Checkout'))

//Input Last Name
WebUI.click(findTestObject('Object Repository/Checkout/Text Field_lastname'))

WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_lastname'), 'Valencia')

//Input Postal Code
WebUI.click(findTestObject('Object Repository/Checkout/Text Field_Postalcode'))

WebUI.setText(findTestObject('Object Repository/Checkout/Text Field_Postalcode'), '15435')

WebUI.click(findTestObject('Object Repository/Checkout/Button_Continue'))

//Expected Result
WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Alert_First Name is required'), 15)