package dataDriven_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_data_Pass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Flights");

		driver.get("http://newtours.demoaut.com/mercurysignon.php");

		driver.manage().window().maximize();
		
		 FileInputStream file = new FileInputStream ("D://Selenium_Files//Selenium_Notes//Excel1.xlsx");
		 
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
		  
		 XSSFSheet sheet = workbook.getSheet("Sheet1"); // Name of sheet
		
		 int row = sheet.getLastRowNum();
		 
		  for ( int i= 1; i<row ; i++) {
			  
			  XSSFRow rl = sheet.getRow(i);
			  
			  int no= (int)rl.getCell(0).getNumericCellValue();
			  String name = rl.getCell(1).toString();
			  String pass = rl.getCell(2).toString();
			  
			  
			  
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElement(By.name("userName")).sendKeys(name);

				driver.findElement(By.name("password")).sendKeys(name);
				
				driver.findElement(By.name("login")).click();
				
			//	driver.findElement(By.xpath(".//input[@name='login']"));
			  
				driver.findElement(By.linkText("SIGN-OFF")).click();
				
				System.out.println("Iteration  "+i);
		  }
		  
System.out.println("Completed");

driver.close();

		
	}

}
