package action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElements_List.Radio_CheckBox;

public class RightClik_ContextMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		System.out.println("Main");

		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		//driver.get("file:///C:/Users/91810/eclipse-workspace/Selenium_p1/WebContent/RightClickButton.html");
		

		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement intra= driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/a"));
		
		act.contextClick(intra).build().perform();  // right Click method
		
		

		
	}

}
