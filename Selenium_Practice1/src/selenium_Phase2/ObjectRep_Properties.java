package selenium_Phase2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.print.attribute.standard.JobOriginatingUserName;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class ObjectRep_Properties {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("main");
		
		ObjectRep_Properties o =new ObjectRep_Properties();
		Properties pro = new Properties();
		
		FileInputStream ip= new FileInputStream("C:\\Users\\91810\\eclipse-workspace\\Selenim_Phase2\\src\\phase2\\config.properties");
		
		pro.load(ip);
		
		String username = pro.getProperty("Username");
		String password = pro.getProperty("Password");
		String Browser = pro.getProperty("Browser");
		String Tools_xpath =pro.getProperty("Tools_xpath"); 
		String url = pro.getProperty("Url");

		System.out.println("Username :"+username );
		System.out.println("Password: "+password);

		if (Browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
			
			 driver = new ChromeDriver();		
			
		}else {
			
			System.out.println("Add Chrome Browser to launch");
		}

		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"accept-cookie-policy\"]")).click();
		Thread.sleep(2000);
		
		WebElement page= driver.findElement(By.xpath(Tools_xpath));
		page.click();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(1);
		System.out.println(driver.getTitle());
		
		
		
		
		


}
}



