package webDriver_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/popuptest2.html");
		
		//driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		//driver.close();
		
		driver.quit();


	}

}
