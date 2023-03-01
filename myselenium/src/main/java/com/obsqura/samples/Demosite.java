package com.obsqura.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//https://www.saucedemo.com/

public class Demosite {
	
	@Test
public void assertSamples() {
	
	WebDriver driver=new EdgeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement text=driver.findElement(By.id("single-input-field"));
	text.sendKeys("New Test Message");
	text.clear();
	//text.sendKeys("Hello");
	System.out.println(text.isDisplayed());
	System.out.println(text.isEnabled());
	System.out.println(text.isSelected());
	System.out.println(text.getTagName());
	Assert.assertEquals(text.getTagName(), "input","Tagname not matching");
	Assert.assertTrue(text.isDisplayed(), "msg displayed");
	System.out.println(text.getAttribute("id"));
	//System.out.println(text.getText());
	WebElement button=driver.findElement(By.id("button-one"));
	System.out.println(button.getText());
	System.out.println(button.getSize());
	System.out.println(button.getCssValue("color"));
	System.out.println(button.getLocation());
	button.click();
	WebElement value1=driver.findElement(By.id("value-a"));
	value1.sendKeys("10");
	WebElement value2=driver.findElement(By.id("value-b"));
	value2.sendKeys("15");
	WebElement button2=driver.findElement(By.id("button-two"));
	button2.click();

}
}
