package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		ScrollBy s= new ScrollBy();
		
		//s.Scroll_Pixls();
		
		s.Scroll_ByElement();
		
	//	s.Scroll_toBottom();

			}
	
	public void Scroll_Pixls() throws InterruptedException {
		
WebDriver driver = new ChromeDriver();

		driver.get("https://history.state.gov/countries/all");
		
		Thread.sleep(1500);

		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollBy(0,1000)","");  // Scroll upto this pixel

		
		
	}
	
	public void Scroll_ByElement() throws InterruptedException {
WebDriver driver = new ChromeDriver();
		

		driver.get("https://history.state.gov/countries/all");
		
		Thread.sleep(1500);

		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		
		WebElement e= driver.findElement(By.linkText("India"));
		
		
		js.executeScript("arguments[0].scrollIntoView();",e);  // Scroll upto the view element

		
		
	}
	public void Scroll_toBottom () throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		

		driver.get("https://history.state.gov/countries/all");
		
		Thread.sleep(1500);

		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  // Scroll to bottom of the page

		
		
	}

}
