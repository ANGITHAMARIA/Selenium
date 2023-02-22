package com.obsqura.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Class2 {

	public static void main(String args[])
	{
		WebDriver driver=new EdgeDriver();
		driver.get("C:/Users/angit/OneDrive/Desktop/Obsqura%20Training/Selenium/day1.html");
		
		//Element locator by id
//		WebElement textbox=driver.findElement(By.id("001"));
//		textbox.sendKeys("Angitha");
//		WebElement radio1=driver.findElement(By.id("002"));
//		radio1.click();
//		WebElement radio2=driver.findElement(By.id("003"));
//		radio2.click();
//		WebElement check=driver.findElement(By.id("004"));
//		check.click();
//		WebElement button=driver.findElement(By.id("005"));
//		button.click();
		
		//Element locator by name
//		WebElement textbox=driver.findElement(By.name("A"));
//		textbox.sendKeys("Angitha");
//		WebElement radio1=driver.findElement(By.name("B"));
//		radio1.click();
//		WebElement radio2=driver.findElement(By.name("C"));
//		radio2.click();
//		WebElement check=driver.findElement(By.name("D"));
//		check.click();
//		WebElement button=driver.findElement(By.name("E"));
//		button.click();
		
		//Element locator by class
		WebElement textbox=driver.findElement(By.className("class1"));
		textbox.sendKeys("Angitha");
		WebElement radio1=driver.findElement(By.className("class2"));
		radio1.click();
		WebElement radio2=driver.findElement(By.className("class3"));
		radio2.click();
		WebElement check=driver.findElement(By.className("class4"));
		check.click();
		WebElement button=driver.findElement(By.className("class5"));
		button.click();
	}
}