package selenium_Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.toolsqa.com/");
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElements(By.tagName("a"));
		
		java.util.List<WebElement> urls = driver.findElements(By.tagName("a"));// Elements for links
		
		java.util.List<WebElement> btns = driver.findElements(By.tagName("button"));// Elements for links
		
		java.util.List<WebElement> cls = driver.findElements(By.tagName("input"));// Elements for links
		
		
		System.out.println("Urls List "+urls.size());
		
		System.out.println("Buttons List "+btns.size());
		
		System.out.println("input List "+cls.size());
		
		
		for ( int i=0; i<urls.size(); i++) {
			
			String string = urls.get(i).getText();		
			
			if (string.equals("SELENIUM TRAINING")) {
			
			System.out.println("value " +string +" -"+i);
			
			break;
			
			}else {

				System.out.println("SELENIUM Training is Not Avaliable-- Pring other list");
				
		//	System.out.println(urls.get(i).getText());
			}
		}

	}
}
