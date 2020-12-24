package com.usa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uk.zoopla.baseclass.SupperClass;

public class UtilityTimeWait extends SupperClass{

    /*    public static void WaitForElement(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));    //select web element
	}
        
    	
	public static String getScreenShot(WebDriver driver, String name) throws IOException {
		String date = new  SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date(0));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+ "/ScreenShots/" + name + date +".png";
		File obj = new File(destination);
		FileUtils.copyFile(source, obj);
		return destination;		
	}*/
		
	public static void waitForElement(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		
	}	
	
	public static String getScreenShot(WebDriver driver, String name) throws IOException {
		String date = new  SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+ "/ScreenShots/" + name + date +".png";
		File obj = new File(destination);
		FileUtils.copyFile(source, obj);
		return destination;		
	}

	
}	
	

