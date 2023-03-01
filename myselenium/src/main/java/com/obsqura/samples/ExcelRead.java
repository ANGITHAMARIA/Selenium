package com.obsqura.samples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelRead {
	ExcelRead e=new ExcelRead();

	public static void main(String[] args) throws IOException 
	{
		
	}
		public void excel(int rowindex,int colindex) throws IOException
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\angit\\OneDrive\\Desktop\\Testdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
	//	XSSFSheet sheet=wb.getSheet("data");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		}
		}
	
	
	public void firstPage()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement text=driver.findElement(By.id("single-input-field"));
		text.sendKeys("New Test Message");
	WebElement value1=driver.findElement(By.id("value-a"));
		value1.sendKeys("10");
		WebElement value2=driver.findElement(By.id("value-b"));
		value2.sendKeys("12");
		WebElement button2=driver.findElement(By.id("button-two"));
		button2.click();
	}
	}
