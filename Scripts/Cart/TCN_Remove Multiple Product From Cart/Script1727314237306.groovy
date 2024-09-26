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
WebUI.callTestCase(findTestCase('Test Cases/Cart/TCP_Add to cart (Multiple Product)'), [:], FailureHandling.STOP_ON_FAILURE)

//Remove multiple product from cart
WebUI.click(findTestObject('Object Repository/Homepage/Button_Remove Backpack'))  // Product Name : Backpack

WebUI.click(findTestObject('Object Repository/Homepage/Button_Remove Bike Light'))  // Product Name : Bike Light

//Expected Result
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Button_Add to Cart'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Button_Add to cart Bike Light'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Icon Link_Cart'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Text Link_Product Name'), 15)

//Next Test Case
