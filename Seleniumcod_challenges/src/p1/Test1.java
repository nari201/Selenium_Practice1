package selenium.p1;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");

		System.setProperty ("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		System.out.println();
		
		

		//driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("mercury");
		
		// tag & Id
		//driver.findElement(By.cssSelector("input#userName")).sendKeys("mercury");
		
		
		// tag & Attribute
		//driver.findElement(By.cssSelector("input[name=password]")).sendKeys("mercury");
		
		
		// Xpath
		// driver.findElement(By.xpath("\r\n" + "//input[@name='login']")).click();
		

		//driver.findElement(By.xpath(".//input[@name='login']")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/a/div[1]/div/a"));
		
		
		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// inner text
		//System.out.println(driver.findElement(By.cssSelector("font color:contains('white')")));
		
		//driver.findElement(By.linkText("Hotels"));
		
		

		driver.quit();
		
			

	}

}
