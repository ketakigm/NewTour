package com.NewTourAssignment2019.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.NewTourAssignment2019.Constant.Constants;
import com.NewTourAssignment2019.Utils.ReadProperties;


public class BaseTestNT implements Constants
{
	public WebDriver driver;
	 ReadProperties configProp;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional(CHROME)String browser) throws InterruptedException
	{ // this method gets executed before every method
		ReadProperties configProp = new ReadProperties("./src/test/resources/config.properties");
		String property_webdriver_chrome_driver = configProp.getKeyValue("property_webdriver_chrome_driver");
		String property_webdriver_gecko_driver = configProp.getKeyValue("property_webdriver_gecko_driver");
		String url = configProp.getKeyValue("url");
		
		if (browser.equalsIgnoreCase(CHROME))
		   {
			System.setProperty(webdriver_chrome_driver,property_webdriver_chrome_driver);
		    driver = new ChromeDriver();
		   }
		 else if(browser.equalsIgnoreCase(FIREFOX))  
		 {
			 System.setProperty(webdriver_gecko_driver, property_webdriver_gecko_driver);
				driver = new FirefoxDriver();
		 }	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.navigate().to(url);
			Thread.sleep(3000); 
			
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
