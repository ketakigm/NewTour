package com.NewTourAssignment2019.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{
	WebDriver driver;
	 //First name field
	@FindBy(how=How.XPATH, using="//input[@name=\'firstName\']")
    WebElement  firstNameEle; 

//Last name field
	@FindBy(how=How.XPATH, using="//input[@name=\'lastName\']")
    WebElement  lastNameEle; 
	
// Phone
	@FindBy(how=How.XPATH, using="//input[@name=\'phone\']")
    WebElement  phoneEle; 
	
//Email
	@FindBy(how=How.XPATH, using="//input[@name=\'userName\']")
    WebElement  emailEle; 
	
//Address
	@FindBy(how=How.XPATH, using="//input[@name=\'address1\']")
	WebElement  addressEle; 	
	
//Address2
	@FindBy(how=How.XPATH, using="//input[@name=\'address2\']")
	WebElement  address2Ele; 
	
//city
	@FindBy(how=How.XPATH, using="//input[@name=\'city\']")
	WebElement  cityEle; 
	
//state
	@FindBy(how=How.XPATH, using="//input[@name=\'state\']")
	WebElement  stateEle; 
	
//Pincode
	@FindBy(how=How.XPATH, using="//input[@name=\'postalCode\']")
	WebElement  pinCodeEle; 
	
//Country drop down	
	@FindBy(how=How.XPATH, using="//select[@name=\'country\']")
	WebElement  countryEle; 
	//Select selectCountry = new Select(country);
	//selectCountry.selectByIndex(5);
	
//user name
	@FindBy(how=How.XPATH, using="//input[@name=\'email\']")
	WebElement userNameEle;
	
//password
	@FindBy(how=How.XPATH, using="//input[@name=\'password\']")
	WebElement passwordEle; 		
	
//confirm password
	@FindBy(how=How.XPATH, using="//input[@name=\'confirmPassword\']")
	WebElement conPasswordEle; 	
	
//submit
	@FindBy(how=How.XPATH, using="//input[@name=\'register\']")
	WebElement submitEle; 
	
	 public RegisterPage(WebDriver webdriver)
	  {
		  driver = webdriver;
		  PageFactory.initElements(driver, this);  
	  }
	// Registration with valid data
	public void doRegisterValid()
	{
		firstNameEle.sendKeys("Ketaki");
		lastNameEle.sendKeys("M");
		phoneEle.sendKeys("123456789");
		emailEle.sendKeys("ketaki.m@gmail.com");
		addressEle.sendKeys("street 23");
		address2Ele.sendKeys("hadapsar");
		cityEle.sendKeys("Pune");
		stateEle.sendKeys("Maha");
		pinCodeEle.sendKeys("654231");
		Select selectCountry = new Select(countryEle);
		selectCountry.selectByIndex(5);
		userNameEle.sendKeys("ketaki.m@gmail.com");
		String pass= "pass123";
		passwordEle.sendKeys(pass);
		conPasswordEle.sendKeys(pass);
		submitEle.click();
	}
	//Register with invalid Data
	public void doRegisterInvalid() throws InterruptedException
	{
		firstNameEle.sendKeys("Ketakim");
		lastNameEle.sendKeys("Man");
		phoneEle.sendKeys("1234588789");
		emailEle.sendKeys("ketaki.gm@gmail.com");
		addressEle.sendKeys("street 23");
		address2Ele.sendKeys("hadapsar");
		cityEle.sendKeys("Pune");
		stateEle.sendKeys("Maha");
		pinCodeEle.sendKeys("655231");
		Select selectCountry = new Select(countryEle);
		selectCountry.selectByIndex(5);
		userNameEle.sendKeys("ketaki.m@gmail.com");
		String pass= "pass123";
		passwordEle.sendKeys(pass);
		conPasswordEle.sendKeys("123");
		submitEle.click();
		//Thread.sleep(4000);
	}
	
}
