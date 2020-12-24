package com.uk.zoopla.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithExcelData {

	public WebDriver driver;
	//public static String testData = "C:\\Users\\enamh\\eclipse-workspace\\YellowTeamAutomation_Practice\\TestData\\userdata.xlsx";

	@Test
	public void loginZoplaWithExcelData() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='cookie-consent-form']/div/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='bhome']/div[2]/div/div/div/header/div/div/div[1]/div/ul/li[4]/a")).click();
		
		ArrayList<String> userName = readExceldata(0);
		ArrayList<String> password = readExceldata(1);
		for (int i = 0; i < userName.size(); i++) {
			driver.findElement(By.xpath("//input[@id='signin_email']")).sendKeys(userName.get(i));
			driver.findElement(By.xpath("//input[@id='signin_password']")).sendKeys(password.get(i));
			driver.findElement(By.xpath("//button[@id='signin_submit']")).click();
			//Thread.sleep(50000);
			//driver.close();
			//driver.quit();

		}
	}

	
	public ArrayList<String> readExceldata(int colno) throws Throwable {
	  
	FileInputStream file = new FileInputStream("C:\\Users\\enamh\\eclipse-workspace\\YellowTeamAutomation_Practice\\TestData\\userdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> rowiterator = sheet.iterator();
		rowiterator.next();
		
		ArrayList<String> list = new ArrayList<String>();
		while (rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(colno).getStringCellValue());
		}
		System.out.println("List : " + list);
		return list;
	}
	/*  public static void main(String[] args) throws Throwable {
		  LoginWithExcelData data = new   LoginWithExcelData();
		  data.loginZoplaWithExcelData();
	} */  
		  
	}   
		   
	
	


