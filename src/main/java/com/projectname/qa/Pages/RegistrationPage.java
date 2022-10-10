package com.projectname.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.projectname.qa.base.Testbase;

public class RegistrationPage extends Testbase  {
	
	//Declaration==webelement
	
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement reg_fblogo;
	@FindBy(xpath="//a[@class='_9bq5']")private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']")private WebElement signuplink;
	@FindBy(name="firstname")private WebElement firstname;
	@FindBy(name="lastname")private WebElement surname;
	@FindBy(name="reg_email__")private WebElement mob_email;
	@FindBy(name="reg_passwd__")private WebElement password;
	@FindBy(name="birthday_day")private WebElement birthday;
	@FindBy(name="birthday_month")private WebElement birthmonth;
	@FindBy(name="birthday_year")private WebElement birthyear;
	@FindBy(xpath="//input[@value='1']")private WebElement gender_male;
	@FindBy(xpath="//input[@value='2']")private WebElement gender_female;
	@FindBy(name="websubmit")private WebElement submitbtn;
	
	//Initaliztion
	public RegistrationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this); 
	}
	

	//usage
	
	public void ClickFacebookSignupLink()
    {
		signuplink.click();
    }
	
	public void VerifyFacebookRegistrationPageFblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "The facebook logo on registration page is not displayed");
	}
	
	public void VerifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "The already having an account option on registration page is  not displayed");
		
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}  
	
	public void SetFacebookRegistrationPagefirstname(String fn) {
		firstname.sendKeys(fn);
		
	}
	
    public void SetFacebookRegistrationPageLastname() {
		surname.sendKeys("xyz");
	}
	
    public void SetFacebookRegistrationPageMobilenoEmail() {
    	mob_email.sendKeys("test123@gmail.com");
    }
	
	public void SetFacebookRegistrationPagePassword() {
		password.sendKeys("abc^def");
	}
	
	public void SetFacebookRegistrationPageBirthDay() {
		Select bday=new Select(birthday);
	    Assert.assertTrue(birthday.isDisplayed(), "Birthdday dropdown is not avialable on website");
	    Assert.assertFalse(birthday.isSelected(), "The birthday is selected initia");
	    bday.selectByVisibleText("14");
	}
	 
	public void SetFacebookRegistrationPageBirthMonth() {
		Select bmonth=new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "Birhdaymonth dropdown is not available on website");
		Assert.assertFalse(birthmonth.isSelected(), "Birthmonth is selected initially");
		bmonth.selectByVisibleText("Apr");
	}
	
	public void SetFacebookRegistrationPageBirthYear() {
		Select byear=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "Birthyear dropdown id not available on website");
		Assert.assertFalse(birthyear.isSelected(), "Birthyear is selectd initially");
		byear.selectByVisibleText("1994");
	}
	
	public void SetFacebookRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("please select valid input");
		}
		
	}
	
	public void ClickFacebookRegistrationPageSubmitBtb() {
		submitbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
