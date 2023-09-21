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

Mobile.startApplication(GlobalVariable.base_apk, false)

WebUI.delay(10)

Mobile.swipe(200, 600, 500, 600)

WebUI.comment('Choose server here below this comment!!')

Mobile.tap(findTestObject('Server/server-App-Staging'), 0)

Mobile.setText(findTestObject('Object Repository/Object Login/input_EditText_Username_Login'), GlobalVariable.usernameMoLeaWizOutlook, 
    0)

Mobile.setText(findTestObject('Object Repository/Object Login/input_EditText_Password_Login'), GlobalVariable.passwordMoLeaWizOutlook, 
    0)

Mobile.tap(findTestObject('Object Repository/Object Login/btn_Login'), 0)

Mobile.tap(findTestObject('Object Settings/btn_Icon_Settings_widget_Button_Settings'), 0)

Mobile.tap(findTestObject('Object Settings/btn_text_view.ViewGroup_Change_Password_Settings'), 0)

Mobile.setText(findTestObject('Object Settings/input_widget.EditText - Old Password_Settings'), '12345', 0)

Mobile.setText(findTestObject('Object Settings/input_widget.EditText - New Password_Settings'), '12345', 0)

Mobile.setText(findTestObject('Object Settings/input_widget.EditText - Confirm New Password_Settings'), '12345', 0)

Mobile.tap(findTestObject('Object Settings/btn_view.ViewGroup_Save_Change_Settings'), 0)

Mobile.tap(findTestObject('Object Settings/btn_view.ViewGroup_Yes_Settings'), 0)

WebUI.delay(3)

Mobile.verifyElementVisible(findTestObject('Object Settings/verify_Successfully_Change_Password_widget.Toast - You have successfully changed your password_Settings'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

Mobile.closeApplication()

