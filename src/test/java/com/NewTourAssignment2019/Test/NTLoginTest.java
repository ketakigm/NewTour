package com.NewTourAssignment2019.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.NewTourAssignment2019.Pages.HomePage;
import com.NewTourAssignment2019.Pages.signONPage;

public class NTLoginTest extends BaseTestNT
{
	public signONPage sPage;
	public HomePage hPage;
    
	@BeforeMethod
	public void beforeMethodInChildClass() throws InterruptedException
	{
		//this method gets executed before every test method
		hPage = new HomePage(driver);
		sPage = new signONPage(driver);
	
		
		//Click Login Link
		hPage.clickOnSigninLink();	
	}
	@Test
	 public void LoginWithValidData() throws InterruptedException
	 {
         sPage.loginValid();
         Thread.sleep(2000);
		
	 }	
	@Test
	 public void LoginWithInValidData() throws InterruptedException
	 {
         sPage.loginInValid();
         Thread.sleep(2000);
		
	 }		
}
