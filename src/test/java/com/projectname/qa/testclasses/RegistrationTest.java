package com.projectname.qa.testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Pages.RegistrationPage;
import com.projectname.qa.base.Testbase;

public class RegistrationTest extends Testbase {
	//methods call.Testcases

	//Browser setup==validation aplied==browser closed
	
	
	@BeforeClass
	public void setup() {
		initializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		RegistrationPage rp=new RegistrationPage(Testbase.driver);
		rp.ClickFacebookSignupLink();
		rp.VerifyFacebookRegistrationPageFblogo();
		rp.VerifyFacebookRegistrationPageAlreadyAccount();
		rp.SetFacebookRegistrationPagefirstname("abc");
		rp.SetFacebookRegistrationPageLastname();
		rp.SetFacebookRegistrationPageMobilenoEmail();
		rp.SetFacebookRegistrationPagePassword();
		rp.SetFacebookRegistrationPageBirthDay();
		rp.SetFacebookRegistrationPageBirthMonth();
		rp.SetFacebookRegistrationPageBirthYear();
		rp.SetFacebookRegistrationPageGender("female");
		rp.ClickFacebookRegistrationPageSubmitBtb();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
