package WebElements_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("\r\n" +
		// "//*[@id=\"cookie_action_close_header\"]")).click();

		driver.findElement(By.name("firstname")).sendKeys("naresh");
		driver.findElement(By.id("lastname")).sendKeys("naresh");

		Thread.sleep(10000);

		driver.findElement(By.xpath("\r\n" + "//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")).click();
		
		//Radio buttons

	/*	System.out.println(driver.findElement(By.xpath("\r\n" + "//*[@id=\"sex-0\"]")).isSelected());
		driver.findElement(By.xpath("\r\n" + "//*[@id=\"sex-0\"]")).click();   */
		
		//CheckBoxes
/* 		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();   */
		
		
	//	driver.findElement(By.xpath("\r\n" + "//*[@id=\"exp-2\"]")).isSelected();

		// drodown
		WebElement drop = driver.findElement(By.id("continents"));

		Select se = new Select(drop);
		
	//	se.selectByIndex(0);
	//	se.selectByValue("AUS");	
		se.selectByVisibleText("Africa");
		
	System.out.println("Size :" +se.getOptions().size());

	}

}
