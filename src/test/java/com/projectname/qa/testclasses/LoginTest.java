package com.projectname.qa.testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Pages.Loginpage;
import com.projectname.qa.base.Testbase;

public class LoginTest extends Testbase{
	
	WebDriver driver;
	
	@BeforeClass
	 public void setup() {
		initializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		Testbase.driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		Loginpage lp=new Loginpage(Testbase.driver);
		lp.VerifyFacebookLoginPageLogo();
		lp.VerifyFacebookLoginPageTagline();
		lp.VerifyFacebookLoginPageForgotPasswordLink();
		lp.VerifyFacebookLoginPageFooterlinksSize();
		lp.SetFacebookLoginPageUsername();
		lp.SetFacebookLoginPagePassword();
		lp.ClickOnLoginPageLoginBtn();
	}

	}


