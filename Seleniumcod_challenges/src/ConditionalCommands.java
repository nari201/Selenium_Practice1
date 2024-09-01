package webDriver_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("\r\n" + "//*[@id=\"email\"]"));

		WebElement pass = driver.findElement(By.xpath("\r\n" + "//*[@id=\"pass\"]"));

		if (email.isDisplayed() && email.isEnabled()) {

			email.sendKeys("settipallinaresh143@gmail.com");
		}
		if (pass.isDisplayed() && pass.isEnabled()) {

			pass.sendKeys("14314312");
		}

		System.out.println("Female:" + driver.findElement(By.xpath("\r\n" + "//*[@id=\"u_0_6\"]")).isSelected()); // Female

		System.out.println("Male: " + driver.findElement(By.xpath("\r\n" + "//*[@id=\"u_0_7\"]")).isSelected()); // Male

		if (driver.findElement(By.xpath("\r\n" + "//*[@id=\"u_0_7\"]")).isSelected() == false) {

			driver.findElement(By.xpath("\r\n" + "//*[@id=\"u_0_7\"]")).click();

			System.out.println(
					"After Click Male: " + driver.findElement(By.xpath("\r\n" + "//*[@id=\"u_0_7\"]")).isSelected());

		}

		driver.close();
	}

}
