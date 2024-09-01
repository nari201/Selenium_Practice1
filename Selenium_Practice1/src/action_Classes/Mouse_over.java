package action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElements_List.Radio_CheckBox;

public class Mouse_over {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		System.out.println("Main");

		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);

		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	WebElement intra= driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/a"));
		
	WebElement dropdown = driver.findElement(By.xpath("\r\n" + 
				"//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));

	WebElement s = driver.findElement(By.xpath("\r\n" + 
				"//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
	
	
	
	//Mouse over actions

	/*
	act.moveToElement(intra).build().perform();
	
	act.moveToElement(dropdown).build().perform();
	
	act.moveToElement(s).click().build().perform();
	 */
	
	act.moveToElement(intra).moveToElement(dropdown).moveToElement(s).click().build().perform();  // All Mouse actions in One syntax
	
	
	}

	

}
