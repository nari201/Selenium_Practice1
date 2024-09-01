package popUp_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authontication_popUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

	//	driver.get("https://naresh.settilpalli:na9May@converge.slk-soft.com/");
		
		driver.get ("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		String text = driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println( text);
	
	}
}
