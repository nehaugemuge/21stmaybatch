package com.projectname.qa.Pages;

 
	


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.Reporter;

import com.projectname.qa.base.Testbase;

	public class Loginpage extends Testbase {
		
		//declaration
		@FindBy(xpath="//img[@class='fb_logo _8ilh img']")private WebElement login_fblogo;
		@FindBy(xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']")private WebElement login_fbtagline;
		@FindBy(xpath="//input[@name='email']")private WebElement username;
		@FindBy(xpath="//input[@name='pass']")private WebElement password;
		@FindBy(xpath="//button[@name='login']" )private WebElement login_butn;
		@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot_password;
		//@FindBy(xpath="value")private WebElement createnew_account;
		@FindBy(xpath="//div[@id='pageFooterChildren']//li")private List<WebElement> footerlinks;
		
		//initialization
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}

		//usage
		public void VerifyFacebookLoginPageLogo(){
			Assert.assertTrue(login_fblogo.isDisplayed(),"The fb logo on login page is not displayed");
			
			Reporter.log("VerifyFacebookLoginPageLogo()",true);
		}  

		public void VerifyFacebookLoginPageTagline(){
			Assert.assertTrue(login_fbtagline.isDisplayed(),"The fbtagline on login page is not displayed");
			Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
			Reporter.log("VerifyFacebookLoginPageTadline()",true);
		}
		
		public void VerifyFacebookLoginPageForgotPasswordLink() {
			Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
			Assert.assertTrue(forgot_password.isDisplayed(), "the forget password link on facebook page is not displayed");
			Reporter.log("VerifyFacebookLoginPageForgetPasswordLink()",true);
		}
		
//		public void VerifyFacebookLoginPageCreatenewAccount() {
	//
//			Assert.assertTrue(createnew_account.isDisplayed(), "createnew account on facebook page is not displayed");
//			Assert.assertTrue(createnew_account.isEnabled(), "createnew account button is disabled");
//			Assert.assertEquals(createnew_account.getText(), "");
	//
//			Reporter.log("VerifyFacebookLoginPageForgetPasswordLink",true);
//			
//			 
//			
//		}

		public void SetFacebookLoginPageUsername() {
			
			Assert.assertTrue(username.isDisplayed(), "username field on facebook page is not displayed");
			username.sendKeys("abcd@gmail.com");
			Reporter.log("SetFacebookLoginPageUsername",true);
		}
		
	   public void SetFacebookLoginPagePassword() {
			
			Assert.assertTrue(password.isDisplayed(), "password field on facebook page is not displayed");
			username.sendKeys("abvc");
			Reporter.log("SetFacebookLoginPagePassword",true);
		}

	   
	   public void ClickOnLoginPageLoginBtn() {
			
			Assert.assertTrue(login_butn.isDisplayed(), "loginbutton on facebook page is not displayed");
			Assert.assertTrue(login_butn.isEnabled(), "login button on facebook page is not enabled");
			login_butn.click();
			Reporter.log("ClickOnLoginPageLoginBtn",true);
		}
	   
	   public void VerifyFacebookLoginPageFooterlinksSize() {
			
			Assert.assertEquals(footerlinks.size(), 31);
			username.sendKeys("abvc");
			Reporter.log("VerifyFacebookLoginPageFooterlinksSize",true);
		}





			
			
		



	}


 
