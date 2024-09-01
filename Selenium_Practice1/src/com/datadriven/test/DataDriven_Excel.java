package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDriven_Excel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	//	driver.get("https://demowebshop.tricentis.com/register");
		
		
		DataDriven_Excel xl = new DataDriven_Excel();
		Xls_Reader reader =new Xls_Reader("C:\\Users\\91810\\eclipse-workspace\\Selenium_p1\\src\\com\\testdata\\Excel1.xlsx‪");
		
 int rowcount = reader.getRowCount("DemoWeb_data");
		
 System.out.println(rowcount);
		
		for ( int rownum =2; rownum<rowcount; rownum++ ) {
			

			String FirstName= reader.getCellData("DemoWeb_data", "FirstName", rownum);
			System.out.println(FirstName);
			
			String LastName= reader.getCellData("DemoWeb_data", "LastName", rownum);
			System.out.println(LastName);
			
			String Email= reader.getCellData("DemoWeb_data", "Email", rownum);
			
			System.out.println(Email);
			
			String Password= reader.getCellData("DemoWeb_data", "Password", rownum);
			System.out.println(Password);
			

			Boolean radio=	driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
			
			System.out.println(radio);
			
			if (radio.equals(true)) { 
				System.out.println("Male is selected");
			}
				else {
				
				 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
				}
			
			driver.findElement(By.xpath("//input[@name='FirstName']")).clear();
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FirstName); // first name
			
			driver.findElement(By.xpath("//input[@name='LastName']")).clear();
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LastName); // Last name
			
			driver.findElement(By.xpath("//input[@name='Email']")).clear();
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email); // Email
			
			driver.findElement(By.xpath("//input[@name='Password']")).clear();
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password); //Password
			
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).clear();
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(Password); //Confirm Password
			
	//		driver.findElement(By.xpath("//input[@id= 'register-button']")).click();
			
			
			// Thread.sleep(2000);
			// driver.findElement(By.xpath("//input[@value='Continue']")).click();
			

			
		}
				
		}
}
		

	
	
	
	

