package selenium.p1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Nth_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
     
		WebDriver driver = new ChromeDriver();
		      String url = "https://www.tutorialspoint.com/index.htm";
		      driver.get(url);
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      // xpath using position() targeting the first element with type text
		    /*  driver.findElement(By.xpath("//input[@type='text'][position()=1]"))
		      .click();  */
		      
		      driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[1]/ul/li[3]")).click();
		      
		      driver.close();
		      
		      System.out.println("Driver closed");
		      
		   }
		

	}


