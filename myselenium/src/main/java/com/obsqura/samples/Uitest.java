package com.obsqura.samples;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Uitest {

	WebDriver driver;
	SoftAssert soft=new SoftAssert();
	
@BeforeTest
public void browserOpen()
{
	driver=new EdgeDriver();
	driver.get("http://www.uitestpractice.com/Students/Form");
}
@Test
public void applicationForm()
{
	
	WebElement firstname=driver.findElement(By.xpath("//input[@id='firstname']"));
	firstname.sendKeys("Angitha");
	soft.assertTrue(firstname.isDisplayed(),"Firstname displayed");
	WebElement lastname=driver.findElement(By.xpath("//input[@id='lastname']"));
	lastname.sendKeys("Thomas");
	//soft.assertTrue(lastname.isDisplayed(),"lastname displayed");
	soft.assertFalse(lastname.isDisplayed(),"lastname displayed");
	System.out.println(lastname.isDisplayed());
//	WebElement maritalstatus=driver.findElement(By.xpath("//input[@name=\"optradio\"]"));
//	maritalstatus.click();
	WebElement hobby=driver.findElement(By.xpath("//input[@value=\"read\"]"));
	hobby.click();
	soft.assertTrue(hobby.isSelected(),"Hobby selected");
	//WebElement country=driver.findElement(By.id("sel1"));
	WebElement country=driver.findElement(By.xpath("//select[@id='sel1']"));
	Select list=new Select(country);
	list.selectByVisibleText("Bahrain");
	soft.assertTrue(country.isDisplayed(),"Country name displayed");
}
}
