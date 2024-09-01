package autoIT_Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/mnjuser/homepage");

		driver.manage().window().maximize();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("settipalli.naresh201@gmail.com");
		

		driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("na@May08");


Thread.sleep(2000);
		driver.findElement(By.xpath("//*//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();

		//*[@id="loginForm"]/div[2]/div[3]/div/button[1]
		
Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div[1]/div[2]/div[1]/div/a[1]/div[2]/div[1]"))
				.click();
		

		WebElement e= 	driver.findElement(By.xpath("//*[@id=\"attachCV\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		WebElement e1= driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div/div[1]/span[1]"));

		js.executeScript("arguments[0].click();", e1);
		
	
		
		Thread.sleep(2000);
		
		
		
		//driver.findElement(By.id("attachCV")).click();


	}

}
