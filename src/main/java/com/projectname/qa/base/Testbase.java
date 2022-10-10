package com.projectname.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testbase {
	
	public static WebDriver driver;
	public void initializeBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium\\chrome105\\chromedriver_win32 (1)\\chromedriver.exe\\");
			 driver = new ChromeDriver();				
		}else
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\selenium\\firefox\\geckodriver.exe\\");
					driver=new FirefoxDriver();
					}else
					{
						System.out.println("wrong browser name selected");
					}
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
	}
}