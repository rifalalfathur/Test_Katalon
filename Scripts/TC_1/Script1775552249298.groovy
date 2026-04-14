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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Page_OrangeHRM/span_mahesh lende'))

WebUI.click(findTestObject('Page_OrangeHRM/a_Logout'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_Username'), 'Admin')

WebUI.clearText(findTestObject('Page_OrangeHRM/input_Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/span_Required_password'), 30)

WebUI.click(findTestObject('Page_OrangeHRM/input_Username'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/span_Required_username'), 30)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Username'), 'Admin123')

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password'), 'RMXzmiOoakwpR9NeVo+OxQ==')

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Invalid credentials'), 30)

