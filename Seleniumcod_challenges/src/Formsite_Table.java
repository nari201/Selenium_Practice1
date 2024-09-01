package handlingWebTables_Calenders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formsite_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Main Method");

		// driver.get("http://newtours.demoaut.com/");

	
		driver.get("https://fs1.formsite.com/form_app/FormSite?FormId=LoadLogin&Auto");

		driver.manage().window().maximize();
		
		driver.findElement(By.name("UserId")).sendKeys("naresh");
		driver.findElement(By.name("Password")).sendKeys("na@8May1994");
		driver.findElement(By.id("login")).click();

		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Create New Form")).click();
		
		

		driver.findElement(By.xpath("\r\n" + "/html[1]/body[1]/div[3]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
		
		//System.out.println( n);
		 
		 

	}

}
