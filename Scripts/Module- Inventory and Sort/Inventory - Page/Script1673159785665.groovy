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

WebUI.callTestCase(findTestCase('Module-Login/Login - Call'), [('username1') : 'standard_user', ('username2') : 'problem_user'
        , ('username3') : 'performance_glitch_user', ('password') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.verifyElementPresent(findTestObject('items/items1'), 0)

WebUI.verifyElementPresent(findTestObject('items/items2'), 0)

WebUI.verifyElementPresent(findTestObject('items/items3'), 0)

WebUI.verifyElementPresent(findTestObject('items/items4'), 0)

WebUI.verifyElementPresent(findTestObject('items/items5'), 0)

WebUI.verifyElementPresent(findTestObject('items/items6'), 0)

WebUI.verifyElementClickable(findTestObject('btn_items/items1_add to cart'))

WebUI.verifyElementClickable(findTestObject('btn_items/items2_add to cart'))

WebUI.verifyElementClickable(findTestObject('btn_items/items3_add to cart'))

WebUI.verifyElementClickable(findTestObject('btn_items/items4_add to cart'))

WebUI.verifyElementClickable(findTestObject('btn_items/items5_add to cart'))

WebUI.verifyElementClickable(findTestObject('btn_items/items6_add to cart'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

