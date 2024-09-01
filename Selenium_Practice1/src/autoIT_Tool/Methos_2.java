package autoIT_Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methos_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methos_2 m= new Methos_2();
		
		

	}
	 public void  call () throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.naukri.com/mnjuser/homepage");

			driver.manage().window().maximize();

			Thread.sleep(1500);

			driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div[1]/div[2]/div[1]/div/a[1]/div[2]/div[1]"))
					.click();
			

			JavascriptExecutor js = (JavascriptExecutor) driver ;
			
			
			WebElement e= driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div/div[1]/span[1]"));
			
			
		//	js.executeScript("arguments[0].scrollIntoView();",e);  // Scroll upto the view element
			
			js.executeScript("argument[0], scrollingView();", e);
			
			driver.findElement(By.xpath("//*[@id=\"attachCV\"]")).click();

		 
	 }

}
