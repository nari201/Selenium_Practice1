package alert_popUp_Frames;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com/");

		Thread.sleep(3000);

		List<WebElement> links = driver.findElements(By.tagName("a")); // used tagName

		int count = links.size();

		int b =0  ,v = 0;
		
		System.out.println("Broken links count " + count);

		for (int i = 1; i < count; i++) {

			WebElement element = links.get(i);

			String url = element.getAttribute("href");

			URL link = new URL(url);
			
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(3000);
			
			httpcon.connect();
			
			int respCode = httpcon.getResponseCode(); //Returns Resp code if Resp code is above 400: broken 
			
			
			if (respCode >=400) {
				
				b= b+1;
				
				System.out.println(url +"   -  "+ " Link is Broken");
			}else {
				v= v+1;
				
				System.out.println( url+ "  - "+" Link is valid");
			}
			
		}

		System.out.println("Broken Url count: "+ b +" && "+ " Valid url Count: "+v);

	}

}
