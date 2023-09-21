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

Mobile.startApplication(GlobalVariable.base_apk, true)

WebUI.delay(10)

Mobile.swipe(200, 600, 500, 600)

WebUI.comment('Choose server here below this comment!!')

Mobile.tap(findTestObject('Server/server-App-Staging'), 0)

Mobile.tap(findTestObject('Object Repository/Object Forgot Password/btn_TextView_Forgot your password'), 0)

Mobile.setText(findTestObject('Object Repository/Object Forgot Password/input_EditText_Username_Forgot_Password'), GlobalVariable.usernameMoLeaWizOutlook, 
    0)

Mobile.tap(findTestObject('Object Repository/Object Forgot Password/btn_TextView_Request Password_Forgot_Password'), 0)

Mobile.tap(findTestObject('Object Repository/Object Login/btn_TextView_Via Email'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Object Forgot Password/verify_User_Successfully_Receive_Email_Auth_TextView_Your password will be sentto you shortly'), 
    0)

Mobile.closeApplication()

