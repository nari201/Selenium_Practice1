package phase2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import javax.print.attribute.standard.JobOriginatingUserName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRep_Properties {
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("main");
		

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		ObjectRep_Properties o =new ObjectRep_Properties();
		
		Properties pro = new Properties();
		
		FileInputStream ip= new FileInputStream("C:\\Users\\91810\\eclipse-workspace\\Selenim_Phase2\\src\\phase2\\config.properties");
		
		pro.load(ip);
		
		String username = pro.getProperty("Username");
		String password = pro.getProperty("Password");
		
		String url = pro.getProperty("Url");
		System.out.println("Username :"+username );
		System.out.println("Password: "+password);
		
		
		
		driver.get(url);
	}

}
