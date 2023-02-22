package com.obsqura.samples;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Class1 
{
public static void main(String args[])
{
	//WebDriver driver =new ChromeDriver();
    WebDriver driver =new EdgeDriver();
    //to open edge browser
//	WebDriver driver =new FirefoxDriver();
    
    //Get commands
    driver.get("https://www.google.com/");
    //to open any webapplication in the above browser
	System.out.println(driver.getTitle());
	//to get the title for current url
	System.out.println(driver.getCurrentUrl());
	//to see the current url
	//System.out.println(driver.getPageSource());
	//sourcecode of the above url
	
	//Navigation commands
	driver.navigate().to("https://www.amazon.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	//Browser commands
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().fullscreen();
	driver.close();
	driver.quit();
}
}
