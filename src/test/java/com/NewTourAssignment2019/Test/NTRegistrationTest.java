package com.NewTourAssignment2019.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.NewTourAssignment2019.Pages.HomePage;
import com.NewTourAssignment2019.Pages.RegisterPage;

public class NTRegistrationTest extends BaseTestNT
{
	public RegisterPage rPage;
	public HomePage hPage;
    
	@BeforeMethod
	public void beforeMethodInChildClass() throws InterruptedException
	{
		//this method gets executed before every test method
		hPage = new HomePage(driver);
		rPage = new RegisterPage(driver);
	
		
		//Click Login Link
		hPage.clickOnRegisterLink();	
		
	}
	@Test
	 public void registerWithValidData() throws InterruptedException
	 {
         rPage.doRegisterValid();
         Thread.sleep(3000);
		
	 }	
	@Test
	 public void registerWithInValidData() throws InterruptedException
	 {
         rPage.doRegisterInvalid();
         Thread.sleep(3000);
		
	 }		
}
