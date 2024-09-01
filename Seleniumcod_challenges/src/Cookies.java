package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		Thread.sleep(1200);
		driver.manage().window().maximize();
		
		Set <Cookie> cookies = driver.manage().getCookies();  // capture cookies from the browser
		
		System.out.println("Size of Cookies: "+ cookies.size());
		
		
		//Add cookie to browser
		Cookie c= new Cookie("NaCookie1111", "1523647890");
		
		driver.manage().addCookie(c);
			
		System.out.println("Size of Cookies: "+ cookies.size());
		
		

		for ( Cookie cookies1: cookies) {
			
		//	System.out.println(cookies1.getName()+ ":"+ cookies1.getValue());  // to get cookie name and value
			
			if ( cookies1.getName().equals("session-id-time")) {
				
				Cookie name = driver.manage().getCookieNamed("session-id-time");
				
				System.out.println("cookie by Named:"+name );
				
				//delete Cookie
				driver.manage().deleteCookieNamed("session-id-time");
				
				//delete AllCookies
				driver.manage().deleteAllCookies();
			}
			
		}
		System.out.println("Size of Cookies: "+ cookies.size());
		
		driver.quit();
		
	}

}