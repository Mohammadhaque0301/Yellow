package com.uk.zoopla.baseclass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SupperClass {
	
	public static WebDriver driver;  //import org.openqa.selenium.WebDriver;
	public static Logger logger;
	public static Properties prop;
	
	public  SupperClass() {    // Constactor for initialized the logger.
	
	logger = Logger.getLogger("Enamul Haque");   // String
	PropertyConfigurator.configure("Log4j.properties"); //location of log4j.properties
	}
	  public static void initialization() throws Throwable {
		prop = new  Properties();
		FileInputStream config = new FileInputStream("Config.properties"); //change to throws Throwable
		prop.load(config);
		
		String br = prop.getProperty("browser");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromebrowser"));
			driver = new ChromeDriver();
		} else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxbrowser"));
			driver = new FirefoxDriver();
		} else if (br.equals("medge")) {
			System.setProperty("webdriver.edge.driver",prop.getProperty("medgebrowser"));
			driver = new EdgeDriver() ;
		
		}
	  	
			driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			   //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  
	  		  
	  }
	  
	}	

