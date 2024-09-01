package robot_Classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();

		//driver.wait();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("Get Title :" + driver.getTitle());
		
		
	}

}
