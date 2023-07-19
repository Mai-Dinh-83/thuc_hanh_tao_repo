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
WebUI.openBrowser("https://auto2023.myshopify.com/account/login")
WebUI.maximizeWindow()

//def array_email = new String[4]
//array_email[0]='maidtt@firegroup.io'
//array_email[1]='maidtt+1@firegroup.io'
////array_email.putAt(2, 'maidtt+2@firegroup.io') 2 đang là 1 string
//WebUI.delay(1)
//def objectMap=[
//account:[email:'maidtt+3@firegroup.io',
//		password: 'Maispf@83'],
//	]
//
//for(def i=0; i<=5; i++)
//{
//
//WebUI.setText(findTestObject('Object Repository/B3_Login/txt_Email_Login_B3'), objectMap.account.email)
//println('Email:'+objectMap.account.email)
//}
login ('maidtt+5@firegroup.io','Maispf@83')
def login (def email, def password )

{
	def Email= WebUI.setText(findTestObject('Object Repository/B3_Login/txt_Email_Login_B3'), email)
	def Password= WebUI.setText(findTestObject('Object Repository/B3_Login/txt_Password_Login_B3'), password)
}

WebUI.delay(1)
//WebUI.setEncryptedText(findTestObject('Object Repository/B3_Login/txt_Password_Login_B3'), 'Maispf@83')
//WebUI.setText(findTestObject('Object Repository/B3_Login/txt_Password_Login_B3'), objectMap.account.password)
//
WebUI.click(findTestObject('Object Repository/B3_Login/btn_Submit_Login_B3'))
//WebUI.delay(1)
WebUI.takeScreenshot('hinh bai 1 _ buoi 3.png') 
//WebUI.closeBrowser()
