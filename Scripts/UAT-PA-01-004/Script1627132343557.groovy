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

WebUI.navigateToUrl('http://eval.sbs-app.com:3003/auth/login')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-004/input__email'), 'admin@demo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UAT-PA-01-004/input__password'), 'PblvLzUlPsM=')

WebUI.click(findTestObject('Object Repository/UAT-PA-01-004/button_'))

WebUI.delay(2)

WebUI.navigateToUrl('http://eval.sbs-app.com:3003/setting/pa-criterions')

WebUI.selectOptionByValue(findTestObject('Object Repository/UAT-PA-01-004/select_256525642563'), '2565', true)

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-004/input__form-control'), '60')

WebUI.click(findTestObject('Object Repository/UAT-PA-01-004/div_256525642563 PA 1   2'))

WebUI.delay(2)

WebUI.closeBrowser()

