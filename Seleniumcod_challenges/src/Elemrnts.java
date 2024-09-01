package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemrnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
    	//By id
    	driver.findElement(By.id("login1")).sendKeys("setti");
        // By name
    	driver.findElement(By.name("passwd")).sendKeys("Test@123");
    	
       	//By xpath
    	driver.findElement(By.xpath("//*[@name=\"proceed\"]")).click();
    	
    	//LinkText for links
    	driver.findElement(By.linkText("Create a new account")).click();
    	
    	//Partial linktext - Not recommended
    	//driver.findElement(By.partialLinkText("reddif.com")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("nani setti");
    	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input")).sendKeys("nanisetti");
    	    		
    	//css selector
    	
    	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input.btn_checkavail")).click();
    	
    	
    	
    	
    		
	}

}
