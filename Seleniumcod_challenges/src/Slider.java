package action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElements_List.Radio_CheckBox;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		System.out.println("Main");

		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);

		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
	WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));  //http://demo.automationtesting.in/Slider.html
	
	act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();   //Drag the Slider
	
	

	
	
		
	}

}
