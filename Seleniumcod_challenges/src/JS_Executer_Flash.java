package javaScript_Executer;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executer_Flash {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("JS_Executor");

		driver.get("https://www.twoplugs.com/");

		driver.manage().window().maximize();

		// flash

		WebElement button = driver.findElement(By.xpath("\r\n" + "/html/body/div/header/div/ul/li[2]/a"));

		// Flash
		// JS_Util.flash(button, driver); 

		// Border & Screen Shot
		JS_Util.Drawborder(button, driver); 

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg = new File("C://User//91810//eclipse-workspace/screenshopt.png");

		// FileUtils.copyFile(src,trg);
		
		//Capture the title of the page
		String title = JS_Util.GetTitle(driver);
		System.out.println(title);
		
		//Click element by JS
	//	JS_Util.Click_JS(button, driver);
		
		//Generate Alert
		//JS_Util.GetAlert(driver, "You clicket on login button..");
		
		//Refresh Page
		//driver.navigate().refresh();
		//JS_Util.Refresh_js(driver);
		
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		JS_Util.scrollIntoView(scroll, driver);
		
		JS_Util.scrollIntoDown(scroll, driver)
		
		
		;
		
		
		
	}

}
