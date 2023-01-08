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

WebUI.navigateToUrl('https://www.saucedemo.com/')

//Test case: login valid username1
WebUI.setText(findTestObject('Login_Page/username'), username1)

WebUI.setEncryptedText(findTestObject('Login_Page/password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Login_Page/btn_login'))

WebUI.click(findTestObject('burger/menu'))

WebUI.click(findTestObject('burger/logout'))

//Test case: login valid username2
WebUI.setText(findTestObject('Login_Page/username'), username2)

WebUI.setEncryptedText(findTestObject('Login_Page/password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Login_Page/btn_login'))

WebUI.click(findTestObject('burger/menu'))

WebUI.click(findTestObject('burger/logout'))

//Test case: login valid username3
WebUI.setText(findTestObject('Login_Page/username'), username3)

WebUI.setEncryptedText(findTestObject('Login_Page/password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Login_Page/btn_login'))

WebUI.click(findTestObject('burger/menu'))

WebUI.click(findTestObject('burger/logout'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

