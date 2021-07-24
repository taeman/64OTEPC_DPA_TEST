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

WebUI.navigateToUrl('http://eval.sbs-app.com:3005/auth/login')

WebUI.click(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/div_(Digital Performamce AppraisalDPA)'))

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/input__email'), 'piyachon.kompang@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/input__password'), '4wKTkCwZKEE=')

WebUI.click(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/button_'))

WebUI.click(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/div_Stockholm-icons  Communication  Group  _fa9e8a'))

WebUI.mouseOver(findTestObject('UAT-PA-01-002/Page_(DPA)/svg_Stockholm-icons  Communication  Write  _c34258'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/svg_Stockholm-icons  Communication  Write  _c34258'))

WebUI.click(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/svg_Stockholm-icons  General  Attachment2  _c8965f'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/UAT-PA-01-002/Page_(DPA)/button__1'))

WebUI.closeBrowser()

