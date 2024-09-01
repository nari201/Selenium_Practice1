package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		LinkAndCSS L = new LinkAndCSS();

		L.css_fb();

		// L.link_flights();

	}

	public void link_flights() {

		WebDriver driver = new ChromeDriver();

		System.out.println("Link_Flights");

		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();

		// driver.wait();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

		driver.findElement(By.xpath("\r\n"
				+ "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
				.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// linkText - Locator
		driver.findElement(By.linkText("Flights")).click();

// innserText - (CssSelector- locator)
		
//	driver.findElement(By.cssSelector("font:contains("FlightDetails")"));
		
	}

	public void css_fb() {

		WebDriver driver = new ChromeDriver();

		System.out.println("CSS_FB");

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// input & Id
		driver.findElement(By.cssSelector("input#email")).sendKeys("settipallinaresh143@gmail.com");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("14314312");

		driver.findElement(By.id("u_0_b")).click();
		

		/*
		//tag & Class Syntax (tag.classname)

		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("settipallinaresh143@gmail.com");
		
		//tag & Attribute Syntax (tag[name=email])

		driver.findElement(By.cssSelector("input[name=email")).sendKeys("settipallinaresh143@gmail.com");
		
		//tag,Class & Attribute syntax (tag.classname[id=name] )
		
		driver.findElement(By.cssSelector("input.inputtext[id=name]")).sendKeys("settipallinaresh143@gmail.com");
		
		driver.switchTo().alert().dismiss();
		
		*/
		
		
		
		
		driver.close();

	}
	
}
