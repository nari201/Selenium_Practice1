package selenium_Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class Custom_xpath {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.hubspot.com/products/crm");
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//driver.switchTo().alert().dismiss();
		
		System.out.println("Get Title "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[@id ='hs-eu-decline-button']")).click(); //With id
		
		//driver.findElement(By.xpath("//a[@role='button' and contains(text(),'Decline')]")).click(); //With out id
		
		driver.findElement(By.xpath("//a[@class= 'ga_nav_link homepage-nav-login']")).click(); //with class
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href,'signup')]")).click(); //with contains
		
	//	driver.findElement(By.xpath("//a[starts-with(@href,'https://app.hubspot.com/signup-hubspot/crm?hubs_signup')]")).click(); //with starts-with
		
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name ='FIRST_NAME']")).sendKeys("nani"); //with name
		
		driver.findElement(By.xpath("//input[@name ='LAST_NAME']")).sendKeys("setti");
		
		driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("nani.setti@gmail.com");
		
		Boolean element= driver.findElement(By.xpath("//button [@data-selenium ='EMAIL_button']")).isEnabled();
		System.out.println(element);
		
		Thread.sleep(3000);
		
	
		if (element==true){
			
			driver.findElement(By.xpath("//button [@data-selenium ='EMAIL_button']")).click();
			
				
		}else {
			System.out.println("Button not enabled");
		} 

	}

}
