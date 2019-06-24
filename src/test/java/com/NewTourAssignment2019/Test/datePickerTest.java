package com.NewTourAssignment2019.Test;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// want to select date as 10May2010 from date picker

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class datePickerTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:/Users/User/Documents/selenium-java-3.141.59/Drivers/chromedriver.exe");
			
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://52.66.93.18/EComPortal/Registration.aspx");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		 		
		  WebElement birthDateElement = driver.findElement(By.id("MainContent_txtDOB"));
		  WebElement birthDateIMGElement= driver.findElement(By.id("MainContent_btnCalender"));
		  birthDateIMGElement.click();
		
		  WebElement calenderElement= driver.findElement(By.xpath("//*[@id=\'MainContent_cldDOB\']"));
		 
		  WebElement pMonthElement= driver.findElement(By.xpath("//a[@title=\'Go to the previous month\']"));
		  
		//  WebElement monthLabelElement= driver.findElement(By.xpath("//*[@id=\'MainContent_cldDOB\']/tbody/tr[1]/td/table/tbody/tr/td[2]"));
   
		     String date="20";
		     LocalDate today = LocalDate.now();    
		     LocalDate userday = LocalDate.of(2018, Month.FEBRUARY, 15); 
		     Period diff = Period.between(userday, today); 
		     int totalMonths = (diff.getYears()*12)+diff.getMonths();
		     System.out.println(totalMonths);
		     System.out.println("\nDifference between "+ userday +" and "+ today +": " 
		     + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
		  
		     for(int i=0; i<totalMonths;i++)
		     {
		    	 
		    	 System.out.println(i);
		    	 
		         System.out.println(pMonthElement.isDisplayed());
		         //Thread.sleep(3000);
			     pMonthElement.click(); 
			     Thread.sleep(2000);
			     pMonthElement= driver.findElement(By.xpath("//a[@title=\'Go to the previous month\']"));
			  //totalMonths--;
		     }
		  
		     calenderElement= driver.findElement(By.xpath("//*[@id=\'MainContent_cldDOB\']"));
			 List<WebElement> tableRows = calenderElement.findElements(By.xpath("//tr"));
				for (WebElement row : tableRows)
				{
					List<WebElement> cells = row.findElements(By.xpath("td"));

					for (WebElement cell : cells) 
					{
						if (cell.getText().equals(date)) 
						{
							driver.findElement(By.linkText(date)).click();
						}
					} 
				}
				
		  System.out.println(birthDateElement.getText());
		  
		  
	}
}	


 