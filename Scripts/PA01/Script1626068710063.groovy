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

WebUI.navigateToUrl('http://eval.sbs-app.com:3005/')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input__email'), 'signalblues@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_(DPA)/input__password'), '4wKTkCwZKEE=')

WebUI.click(findTestObject('Object Repository/Page_(DPA)/button_'))

WebUI.click(findTestObject('Page_(DPA)/svg_Stockholm-icons  Communication  Write  _c34258'))

WebUI.click(findTestObject('Date/GO01'))

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input_1_score_1_1'), '45')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input_1_score_1_2'), '30')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input_1_score_1_3'), '50')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input_2_score_2_1'), '25')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input_2_score_2_2'), '30')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input_2_score_2_3'), '40')

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input__form-control form-control-lg form-co_7c7bc1'), 'ไพศาส')

WebUI.click(findTestObject('Date/date1'))

WebUI.click(findTestObject('Page_(DPA)/div_2'))

WebUI.setText(findTestObject('Page_(DPA)/name2'), 'สมทรง')

WebUI.click(findTestObject('Date/date2'))

WebUI.click(findTestObject('Page_(DPA)/div_3'))

WebUI.setText(findTestObject('Object Repository/Page_(DPA)/input__fullname_result_evaluate3'), 'อาราม')

WebUI.click(findTestObject('Date/enter'))

WebUI.click(findTestObject('Object Repository/Page_(DPA)/button_Back'))

