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

WebUI.navigateToUrl('https://qa.dev-adventure.com/')

WebUI.click(findTestObject('Object Repository/TC004/Page_Adventure Hotels  Vacation Rentals at _68e8f5/span_I Accept'))

WebUI.click(findTestObject('Object Repository/TC004/Page_Adventure Hotels  Vacation Rentals at _68e8f5/svg_Vacation Rental_text-iconDarkLight dark_51d02c'))

WebUI.click(findTestObject('Object Repository/TC004/Page_Adventure Hotels  Vacation Rentals at _68e8f5/div_USD  ENG_absolute w-full h-full z-20 bg_5d0375'))

WebUI.click(findTestObject('Object Repository/TC004/Page_Adventure Hotels  Vacation Rentals at _68e8f5/button_Search'))

