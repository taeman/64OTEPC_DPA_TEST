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

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input__email'), 'piyachon.kompang@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input__password'), '4wKTkCwZKEE=')

WebUI.click(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/button_'))

WebUI.click(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/a_Stockholm-icons  Communication  Write    _033300'))

WebUI.click(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/a_Stockholm-icons  Communication  Write    _033300_1'))

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input_1_score_1_1'), '40')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input_1_score_1_2'), '30')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input_1_score_1_3'), '10')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input_2_score_2_1'), '10')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input_2_score_2_2'), '20')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input_2_score_2_3'), '20')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input__form-control form-control-lg form-co_14a1f4'), 
    'มานะ ทันที')

WebUI.setText(findTestObject('UAT-PA-01-001/input__form-control form-control-lg form-co_left'), 'สมบูรณ์ พูนพัน')

WebUI.setText(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/input__fullname_result_evaluate3'), 'วีระพงษ์ ขวัญมา')

WebUI.click(findTestObject('Object Repository/UAT-PA-01-001/Page_(DPA)/i_Back_fa fa-arrow-left'))

WebUI.closeBrowser()

