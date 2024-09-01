package selenium_Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ParentLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("\r\n"
				+ "\r\n"
				+ "//a[text()='test2test2']//parent::td[@calss='value']//preceding-sibling::td[@class='value']//input[@name='value']\r\n"
				+ "")); // Parent_Preceding Sibling
		
		driver.findElement(By.xpath("\r\n"
				+ "\r\n"
				+ "//a[text()='test2test2']//parent::td[@calss='value']//forwarding-sibling::td[@class='value']//input[@name='value']\r\n"
				+ "")); //Parent Forwarding sibling
		
		
		//div[@class='value']//button[@type='value' and @class='value' and @id='value']   
		
		//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']/descendant::div[@class='pcTkSc']/descendant::div[@class='wM6W7d']/descendant::span[text()='testing']
	  	
		
		//parent::td[@...]//preceding-siblig::td[@...]
		
		//li/descendent::div[@..]/descendan::span[text() ='testing']
	}

}
