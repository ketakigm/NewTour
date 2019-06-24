package com.NewTourAssignment2019.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signONPage
{
	WebDriver driver;
	//user name
	@FindBy(how=How.XPATH, using="//input[@name=\'userName\']")
	WebElement userNameEle;
	
	//password
	@FindBy(how=How.XPATH, using="//input[@name=\'password\']")
	WebElement passwordEle; 		
	
	//submit
		@FindBy(how=How.XPATH, using="//input[@name=\'login\']")
		WebElement loginEle; 
	
	  public signONPage(WebDriver webdriver)
	  {
		  driver = webdriver;
		  PageFactory.initElements(driver, this);  
	  }
	  
	  public void loginValid ()
	  {
		    userNameEle.sendKeys("ketaki.m@gmail.com");
			//String pass= "pass123";
			passwordEle.sendKeys("pass123");
			loginEle.click();
	  }
	  
	  public void loginInValid ()
	  {
		    userNameEle.sendKeys("ketaki.m@gmail.com");
			//String pass= "pass123";
			passwordEle.sendKeys("123456");
			loginEle.click();
	  }
}
