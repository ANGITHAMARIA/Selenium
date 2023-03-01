package com.obsqura.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrial {

	@Test
	public void firstPage()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement text=driver.findElement(By.id("single-input-field"));
		text.sendKeys("New Test Message");
		WebElement button=driver.findElement(By.id("button-one"));
		button.click();
		WebElement msg=driver.findElement(By.id("message-one"));
		System.out.println(msg.getText());
		Assert.assertEquals(msg.getText(), "Your Message : New Message","Failure message:Text Mismatch");
		
	}
	@Test
	public void second()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement value1=driver.findElement(By.id("value-a"));
		value1.sendKeys("10");
		WebElement value2=driver.findElement(By.id("value-b"));
		value2.sendKeys("15");
		WebElement button2=driver.findElement(By.id("button-two"));
		button2.click();		
	}
	//http://webdriveruniversity.com/index.html
}
