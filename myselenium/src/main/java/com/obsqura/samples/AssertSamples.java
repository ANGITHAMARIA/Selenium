package com.obsqura.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertSamples {

	WebDriver driver;
	
	@BeforeTest
	public void browserLaunch()
	{
		driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
	}
	
	@Test
	public void test1()
	{
		WebElement msg=driver.findElement(By.id("single-input-field"));
		msg.sendKeys("New Message");
		System.out.println(msg.isDisplayed());
		//Assert.assertTrue(msg.isDisplayed(),"Value displayed");
		Assert.assertFalse(msg.isDisplayed(),"Value missing");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
