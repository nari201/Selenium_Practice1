package alert_popUp_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_boxs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		Alert_boxs a = new Alert_boxs();

		//a.Alert_ok();
		// a.Alert_ok_cancel();
		a.Alert_withTextbox();

	}

	public void Alert_ok() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

		String text = driver.switchTo().alert().getText();

		if (text != null) {

			driver.switchTo().alert().accept();

			System.out.println(text);

		}

	}

	public void Alert_ok_cancel() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		// driver.findElement(By.linkText("Alert with OK &amp; Cancel")).click(); // By
		// Link Text

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click(); // By Xpath

		WebElement button = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));

		button.click();

		String text = driver.switchTo().alert().getText();

		if (text != null) {

			driver.switchTo().alert().accept(); // to click ok

			System.out.println("alert text: " + text);

			String Expected_text = "You pressed Ok";

			String Actual_text = driver.findElement(By.id("demo")).getText();

			if (Expected_text.equals(Actual_text)) {

				System.out.println(Actual_text + " Passed");
			}

			button.click();
			driver.switchTo().alert().dismiss(); // to click cancel

			Actual_text = driver.findElement(By.id("demo")).getText();

			System.out.println(Actual_text + " Passed");

		}

	}

	public void Alert_withTextbox() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Alert with Textbox")).click();

		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();

		String text = driver.switchTo().alert().getText();

		String name = "N@resh";

		if (text != null) {

			driver.switchTo().alert().sendKeys(name);

			driver.switchTo().alert().accept();

			System.out.println(text);

			String actual = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();

			String Expected = "Hello " + name + " How are you today";
			
			if ( actual.equals(Expected)) {
				
				System.out.println("TC Passed "+ actual);
				
			}else {
				System.out.println("Failed " +actual);
			}

		}

	}

}
