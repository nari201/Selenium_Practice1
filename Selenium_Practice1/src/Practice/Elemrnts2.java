package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemrnts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().alert().dismiss();
		
    	//LinkText for links
    	driver.findElement(By.linkText("Demo Site")).click();
    	
    	//Partial linktext - Not recommended
    	//driver.findElement(By.partialLinkText("reddif.com")).click();
    	
    	//img[@id='advertisement-image']
    	
    		
	}

}
