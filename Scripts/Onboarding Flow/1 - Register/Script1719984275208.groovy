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

import java.util.UUID
import org.apache.commons.lang.RandomStringUtils
import java.util.ArrayList
//import java.util.Collections
//import com.kms.katalon.core.testobject.RequestObject as RequestObject
//import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.testobject.TestObjectProperty
//import com.kms.katalon.core.testobject.ConditionType

// Navigate to registration page
WebUI.openBrowser('')
WebUI.navigateToUrl("https://remit.pazemo.dev/signup")

// Random data generation
String uniqueSuffix = RandomStringUtils.randomAlphanumeric(1)
//String email = "test${uniqueSuffix}@gav7a2dq.mailosaur.net"
String email = "test${uniqueSuffix}@grr.la"
//String companyName = "PT " + RandomStringUtils.randomAlphabetic(5)
//String fullName = "Test" + RandomStringUtils.randomAlphabetic(10)
String phoneNumber = "0812" + RandomStringUtils.randomNumeric(7)  // Example format for Indonesian phone numbers
//String password = "Test123%"
//String genPassword() {
//	String upperCase = RandomStringUtils.random(2, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')
//	String lowerCase = RandomStringUtils.random(2, 'abcdefghijklmnopqrstuvwxyz')
//	String numbers = RandomStringUtils.random(2, '0123456789')
//	String specialChars = RandomStringUtils.random(2, '!@#$%^&*()')
//	String combinedChars = upperCase + lowerCase + numbers + specialChars
	
	// Convert the combined string to a list of characters
//	List<Character> chars = new ArrayList<>()
//	for (char c : combinedChars.toCharArray()) {
//		chars.add(c)
//	}
	
	// Shuffle the list of characters
//	Collections.shuffle(chars)
	
	// Convert the list back to a string
//	StringBuilder shuffledPassword = new StringBuilder()
//	for (char c : chars) {
//		shuffledPassword.append(c)
//	}
	
//	return shuffledPassword.toString()
//}
//String password = genPassword()

// Input registration form
WebUI.setText(findTestObject('Object Repository/Register/inputCompanyName'), 'PT Test', FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Register/inputPicEmail'), email, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Register/inputFullName'), 'PIC Test', FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Register/inputPhoneNumber'), phoneNumber, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Register/inputPassword'), 'Test123$')
WebUI.click(findTestObject('Object Repository/Register/checkBoxTerms'))
WebUI.click(findTestObject('Object Repository/Register/btnRegister'))

// print the email and 
println ("Email: " + email)
println("Password: " + 'Test123$')

// Wait for the email to be sent and processed
//WebUI.delay(50)