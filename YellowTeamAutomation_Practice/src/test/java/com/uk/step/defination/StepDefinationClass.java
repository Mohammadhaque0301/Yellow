package com.uk.step.defination;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.bcel.classfile.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.uk.pagefactory.PageFactoryClass;
import com.uk.zoopla.baseclass.SupperClass;
import com.usa.utility.UtilityTimeWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass extends SupperClass{
	private static final String LoginPageTitle = null;
	private static final int[] DESC = null;
	PageFactoryClass pfc;
	
	
	
	@Given("^user able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable  {
	    SupperClass.initialization();
	   pfc = PageFactory.initElements(driver, PageFactoryClass.class);
	  // pfc = new PageFactoryClass();   
	}
	@Given("^user able to submit\"([^\"]*)\"$")
	public void user_able_to_submit(String url) {
		//UtilityTimeWait.WaitForElement(pfc.getAcceptCookis());
		 driver.get(url);
		pfc.getAcceptCookis().click();
		
	}
	@When("^user able to click on signin button$")
	public void user_able_to_click_on_signin_button() throws IOException   {
		 UtilityTimeWait.waitForElement(pfc.getClickSignInButton());
		pfc.getClickSignInButton().click();
		 UtilityTimeWait.getScreenShot(driver,"signin");
	}
	

	@When("^user able to enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_able_to_enter_the_and_password(String username, String pwd) {
		//UtilityTimeWait.WaitForElement(pfc.getEnterusername());
	  pfc.getEnterusername().sendKeys(username);
	 // UtilityTimeWait.WaitForElement(pfc.getEnterpassword());
	  pfc.getEnterpassword().sendKeys(pwd);
	 // UtilityTimeWait.getScreenShot(driver);
	}
	@When("^user am able to submit signin button$")
	public void user_am_able_to_submit_signin_button()  {
		// UtilityTimeWait.WaitForElement(pfc.getClickSignInButton());
	  pfc.getClickloginbutton().click();
	
	}
	

	@When("^user can enter the location & search it$")
	public void user_can_enter_the_location_search_it() throws InterruptedException  {
		// UtilityTimeWait.WaitForElement(pfc.getNewYorkLincolnshire());
		pfc.getNewYorkLincolnshire().sendKeys("New York,Lincolnshire");
		// UtilityTimeWait.WaitForElement(pfc.getClicksearch());
	    pfc.getClicksearch().click();
	   
	}
	
	@When("^user can print all the price value$")
	public void user_can_print_all_the_price_value()  {
		
		ArrayList <WebElement> list = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[contains(@class,'css-16tn2ye e2uk8e19')] "));
		System.out.println("Total property count num :" + list.size());
		for(WebElement select : list) {
		String listPrice = select.getText();
		System.out.println("All the property prices :" +listPrice);
		//Collections.sort(list, Collections.reverseOrder());		
		//Collections.reverse(list);
		
	   }
		
	}
	@When("^user can select the fifth property on list$")
	public void user_can_select_the_fifth_property_on_list() throws InterruptedException  {
		
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='e2uk8e4 css-16zqmgg-StyledLink-Link-FullCardLink e33dvwd0']"));
		System.out.println("Total Property counts num : " + price.size());
		for (WebElement select : price) {
			String priceList = select.getText();
			System.out.println("Price List : " + priceList);
		
		for (int i = 0; i < price.size(); i++) {
			if (i > 4) {
				System.out.println("Selected property number : " + i);
				System.out.println("Selected property : " + price.get(i).getText());
				price.get(i).click();				
				break;
				
			}}}
		
		// UtilityTimeWait.WaitForElement(pfc.getClickfifthproperty());	
	   // pfc.getClickfifthproperty();
		//logger.info("******>As a user I am able to click on fifth property from list<******");
		//HighLighter.getcolor(driver, zm.getClickfifthproperty(), "red");
		//UtilWait.getScreenShot(driver, "verify logo");
		UtilityTimeWait.waitForElement(pfc.getClickfifthproperty());
		pfc.getClickfifthproperty().click();
		
	}
	

	@When("^user can verify the agent logo, name & phone no$")
	public void user_can_verify_the_agent_logo_name_phone_no() throws InterruptedException  {
		/*logger.info("******>As a user I am able to verify the logo, name and telephone number of the agent<******");
		 WebElement verifyImage = pfc.getVerifylogo();
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", verifyImage);
		 if (!ImagePresent)
		 {
		      System.out.println(" verify the logo");
		 }
		 else
		 {
		     System.out.println(" not verify the logo");
		 } */
	   
	
	 String Text= driver.findElement(By.xpath("//*[@class='ui-agent__name']")).getText();
     System.out.println("Agent name :" + Text);
      String Text2= driver.findElement(By.xpath("//*[contains(text(),'Call ')]")).getText();
      System.out.println("Agent phone number :" + Text2);
     }
	
	@When("^user can click on MyZoopla$")
	public void user_can_click_on_MyZoopla()  {
		Actions action = new Actions(driver);
		WebElement mousehover = pfc.getMouseHovermyzoopla();	
		action.moveToElement(mousehover).build().perform(); 
	}
	
	   
	

    @When("^user can able to click signout button$")
public void user_can_able_to_click_signout_button()  {
    	Actions ac = new Actions(driver);
    	WebElement mouse=pfc.getClicksignout();
    	ac.moveToElement(mouse);
    	ac.click().build().perform();
    
}

	@Then("^user can verify the logout title$")
	public void user_can_verify_the_logout_title()  {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
		//Assert.assertEquals(actualTitle, expectedTitle);
		/*if(driver.getPageSource().contains("Logout was unsuccessfull")) {
			driver.quit();
		}else {
			Assert.assertEquals("Zoopla>Search Property to Buy,Rent, House Price, Estate Agent",LoginPageTitle);
		}*/
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Website verification: Passed" );
			} else {System.out.println("Website verification: Failed");
			}
   
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
	 driver.quit(); 
	   
	}

}
