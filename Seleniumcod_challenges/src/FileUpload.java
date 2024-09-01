package autoIT_Tool;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		Thread.sleep(1500);

		// driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();

		// driver.findElement(By.id("imagesrc")).click();

		Runtime.getRuntime().exec("C://Users//91810//eclipse-workspace//AutoIT/FileUpload_1.exe"); // Execute the .exe
																									// file by AutiIT
																									// Scrip
	}

}
