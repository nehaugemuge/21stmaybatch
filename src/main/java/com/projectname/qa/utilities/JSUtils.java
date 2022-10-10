package com.projectname.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class JSUtils {
	
	//take screenshot
	public static void takescreenshotbyjs(WebDriver driver) throws IOException {
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(source, new File("C:\\Users\\HP\\Desktop\\scrshot\\regitration.png"));

 }
	//handleexcel
	public static String Excelhandelbyjs(WebDriver driver) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Pracsheet.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
		System.out.println(value);
		return value;
	
}
	
}