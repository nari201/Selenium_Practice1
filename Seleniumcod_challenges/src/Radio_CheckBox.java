package WebElements_List;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		Radio_CheckBox R = new Radio_CheckBox();

		System.out.println("Main");

		WebDriver driver = new ChromeDriver();
		

		//driver.get("http://demo.automationtesting.in/Register.html");

		 R.Radio_check();
		//	R.Dynamic_Check();
			
			

	}

	public void Radio_check() {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Radio_check");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement radio1 = driver
				.findElement(By.xpath("\r\n" + "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));

		WebElement radio2 = driver
				.findElement(By.xpath("\r\n" + "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));

		String value = radio1.getAttribute("value");

		if (value == "female") {

			System.out.println(value);
			radio1.click();
		} else {

			System.out.println(radio2.getAttribute("value"));

			radio2.click();
		}

		driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("checkbox2")).click();
		

		System.out.println("Check boxes selected ");

	}

	public void Dynamic_Check() throws InterruptedException {


		WebDriver driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
		

	//	Thread.sleep(2000);

		driver.manage().window().maximize();
		

		
		List <WebElement> checkBox =(List<WebElement>) driver.findElements(By.xpath("\r\n" + "//*[@type=\"checkbox\"]"));

		for (int i = 0; i< checkBox.size(); i++) {
			
			WebElement Element = checkBox.get(i);
			
			String value = Element.getAttribute("value");
			
			Element.click();
			
			System.out.println(value);
		}
		
		System.out.println("End");
		
		driver.quit();
		
	}
}
