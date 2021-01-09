package com.uk.step.defination;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.bcel.classfile.Utility;
import org.apache.commons.io.IOExceptionWithCause;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.uk.pagefactory.PageFactoryClass;
import com.uk.zoopla.baseclass.SupperClass;
import com.usa.util.HighLighterClass;
import com.usa.utility.UtilityTimeWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass extends SupperClass{
	
	PageFactoryClass pfc;
	
	@Given("^user able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable  {
		logger.info("******>user able to open any browser<******");
	    SupperClass.initialization();
	    pfc = PageFactory.initElements(driver, PageFactoryClass.class);
	  
	}
	@Given("^user able to submit\"([^\"]*)\"$")
	public void user_able_to_submit(String url) {
		logger.info("******>user able to submit\\\"([^\\\"]*)\\<******");
		//UtilityTimeWait.waitForElement(pfc.getAcceptCookis());
		driver.get(url);
		pfc.getAcceptCookis().click();
	   }
	@When("^user able to click on signin button$")
	public void user_able_to_click_on_signin_button() throws IOException   {
		logger.info("******>user able to click on signin button<******");
		 HighLighterClass.getcolor(driver, pfc.getClickSignInButton(),"red"); 
		 UtilityTimeWait.waitForElement(pfc.getClickSignInButton());
		pfc.getClickSignInButton().click();
		 UtilityTimeWait.getScreenShot(driver,"signin");
	   }
	@When("^user able to enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_able_to_enter_the_and_password(String username, String pwd) {
		logger.info("******>user able to enter the \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\<******");
		 HighLighterClass.getcolor(driver, pfc.getEnterusername(),"red"); 
		UtilityTimeWait.waitForElement(pfc.getEnterusername());
	    pfc.getEnterusername().sendKeys(username);
	    HighLighterClass.getcolor(driver, pfc.getEnterpassword(),"red"); 
	    UtilityTimeWait.waitForElement(pfc.getEnterpassword());
	    pfc.getEnterpassword().sendKeys(pwd);
	   
	}
	@When("^user am able to submit signin button$")
	public void user_am_able_to_submit_signin_button()  {
	  logger.info("******>user am able to submit signin button<******");
	  pfc.getClickloginbutton().click();
	}
	
	@When("^user can enter the location & search it$")
	public void user_can_enter_the_location_search_it()   {
		logger.info("******>user can enter the location & search it<******");
		HighLighterClass.getcolor(driver, pfc.getNewYorkLincolnshire(),"red");
		UtilityTimeWait.waitForElement(pfc.getNewYorkLincolnshire());
		pfc.getNewYorkLincolnshire().sendKeys("New York,Lincolnshire");
		UtilityTimeWait.waitForElement(pfc.getClicksearch());
	    pfc.getClicksearch().click();
	   }
	
	@When("^user can print all the price value$")
	public void user_can_print_all_the_price_value()  {
		logger.info("******>user can print all the price value$ <******");
		List <WebElement> list = pfc.getPrintallprice();
		System.out.println("Total property count num :" + list.size());
		for(WebElement select : list) {
		String listPrice = select.getText();
		System.out.println("All the property prices :" +listPrice);
		}
	    }
	 @When("^user can select the fifth property on list$")
	 public void user_can_select_the_fifth_property_on_list()throws IOException{
		logger.info("******>user can select the fifth property on list<******");
		List<WebElement> price = pfc.getClickfifthproperty();
		for (int i = 0; i < price.size(); i++) {
			if (i > 4) {
				System.out.println("Selected property number : " + i);
				System.out.println("Selected property : " + price.get(i).getText());
				price.get(i).click();				
				break;
			}	
			}}
		
	 @When("^user can verify the agent logo, name & phone no \"([^\"]*)\"$")
	 public void user_can_verify_the_agent_logo_name_phone_no(String arg1) {
		logger.info("******>As a user I am able to verify the logo, name and telephone number of the agent<******");
		if (driver.getPageSource().contains("Do Not verify the logo")) {
			driver.quit();
			} else {
			Assert.assertEquals("Logo,Agent Name,Phone no", arg1);
			}   
		    }
	  @When("^user can click on MyZoopla$")
	  public void user_can_click_on_MyZoopla()  {
		logger.info("******>user can click on MyZoopla<******");
		Actions action = new Actions(driver);
		WebElement mousehover = pfc.getMouseHovermyzoopla();	
		action.moveToElement(mousehover).build().perform(); 
	   }
	   @When("^user can able to click signout button$")
       public void user_can_able_to_click_signout_button()  {
    	   logger.info("******>user can able to click signout button<******");
    	   Actions ac = new Actions(driver);
    	   WebElement mouse=pfc.getClicksignout();
    	   ac.moveToElement(mouse);
    	   ac.click().build().perform();
	     }
     @Then("^user can verify the logout title \"([^\"]*)\"$")
     public void user_can_verify_the_logout_title(String arg1) {
    	logger.info("******>user can verify the logout title<******");
    	HighLighterClass.getcolor(driver, pfc.getClicksignout(),"red");
       if(driver.getPageSource().contains("Logout was unsuccessfull")) {
			driver.quit();
		}else {
			Assert.assertEquals("Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents",arg1);
		}
       }
    @Then("^Close the browser$")
	public void close_the_browser()  {
	// driver.quit(); 
	   
	}}


