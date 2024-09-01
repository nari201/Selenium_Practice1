package action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElements_List.Radio_CheckBox;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		System.out.println("Main");

		WebDriver driver = new ChromeDriver();

		Actions act = new Actions(driver);

		driver.get("https://jqueryui.com/resizable/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

	/*	driver.switchTo().frame(0);

		WebElement Resize = driver.findElement(By.xpath("\r\n" + 
				"//*[@id=\"resizable\"]/div[3]"));
		
		
		act.moveToElement(Resize).dragAndDropBy(Resize, 150, 80).build().perform();  // Resize
		*/
		
	
	driver.close();
	
		System.out.println("Resize done");
		

	}

}
