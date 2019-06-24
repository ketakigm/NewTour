package com.NewTourAssignment2019.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
  WebDriver driver;
   
  @FindBy(how=How.PARTIAL_LINK_TEXT, using="SIGN-ON")
	 WebElement signInLinkElement;
  @FindBy(how=How.PARTIAL_LINK_TEXT, using="REGISTER")
	 WebElement registerLinkElement;
  
  public HomePage(WebDriver webdriver)
  {
	  driver = webdriver;
	  PageFactory.initElements(driver, this);  
  }
  
  public void clickOnSigninLink()
  {
	  signInLinkElement.click();
  }
  public void clickOnRegisterLink()
  {
	  registerLinkElement.click();
  }
}
