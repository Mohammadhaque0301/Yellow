package com.uk.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.uk.zoopla.baseclass.SupperClass;

public class PageFactoryClass extends SupperClass {
	
	public PageFactoryClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	
	private WebElement acceptCookis;
    public WebElement getAcceptCookis() {
	return acceptCookis;
    }
    
	@FindBy (linkText="Sign in")
	@CacheLookup
	private WebElement clickSignInButton;
    public WebElement getClickSignInButton() {
	return clickSignInButton;
	}
    
	@FindBy (id ="signin_email")
	@CacheLookup
	private WebElement enterusername;
    public WebElement getEnterusername() {
	return enterusername;
	}
    
	@FindBy (id ="signin_password")
	@CacheLookup
	private WebElement enterpassword;
    public WebElement getEnterpassword() {
	enterpassword.click();
	return enterpassword;
	}

	@FindBy (id ="signin_submit")
	@CacheLookup
	private WebElement clickloginbutton;
    public WebElement getClickloginbutton() {
	return clickloginbutton;
	}

	@FindBy (xpath="//*[@class='search-input geo_autocomplete']")
	@CacheLookup
	private WebElement NewYorkLincolnshire;
   public WebElement getNewYorkLincolnshire() {
		return NewYorkLincolnshire;
	}
	
	
	@FindBy (id = "search-submit")
	@CacheLookup
	private WebElement clicksearch;
    public WebElement getClicksearch() {
	return clicksearch;
    }
    
	@FindBy(xpath="//*[contains(@class,'css-qmlb99-CardHeader e2uk8e9')]")
	@CacheLookup
	private List <WebElement>printallprice;
	
	
	public List<WebElement> getPrintallprice() {
		return printallprice;
	}
	
    /* public void listprice() {
    	 List<WebElement>list = driver.findElements(By.xpath("//*[@class='earci3d1 css-gdki81 e1w23gwf18']"));
    	 for(int i= 0;i<list.size();i++) {
    		
    		 System.out.println("prices of all houses" + list.get(i).getText());
    		 
    		/*@FindBy (xpath ="(//*[contains(@class,'e1w23gwf24 css-1tw68d1 e16lreco0')])[5]")
	@CacheLookup
	private WebElement clickfifthproperty;
    public WebElement getClickfifthproperty() {
	return clickfifthproperty;
	}*/
	@FindBy(xpath = "//*[@class='e2uk8e4 css-16zqmgg-StyledLink-Link-FullCardLink e33dvwd0']")
	@CacheLookup
	private List <WebElement> clickfifthproperty;
	public List<WebElement> getClickfifthproperty() {
		return clickfifthproperty;
	}
	/*@FindBy(xpath = "//*[@class='js-lazy-loaded']")
	private WebElement verifylogo;
	public WebElement getVerifylogo() {
		return verifylogo;
	}*/
    
    @FindBy(xpath ="(//*[@class='css-jm7194 el4rvi44'])[1]")
   	private WebElement mouseHovermyzoopla;

   	public WebElement getMouseHovermyzoopla() {
   		return mouseHovermyzoopla;
   	}
   	
   	@FindBy(xpath = "(//*[@content='Sign out'])[1]")
      private WebElement clicksignout;

   	public WebElement getClicksignout() {
   		return clicksignout;
   	}
}
      	
