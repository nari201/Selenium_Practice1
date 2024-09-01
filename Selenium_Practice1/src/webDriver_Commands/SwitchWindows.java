package webDriver_Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class SwitchWindows {

	public static void main(String[] args) throws UnexpectedTagNameException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();	
		
		driver.findElement(By.linkText("SwitchTo")).click();
		
		driver.findElement(By.linkText("Windows")).click();
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("\r\n" + "//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set <String> s = driver.getWindowHandles(); // Return ids of all browser windows
		
		for (String i:s) {
			
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			
			System.out.println(t);
			
			if(t.contains("Frames & windows")) {
				
				driver.close();
			}
			
		}
		/*
		
		WebElement drop = driver.findElement(By.linkText("SwitchTo"));
		
		Select se = new Select(drop);
		
		ArrayList temp = new ArrayList();
		
	//	List<WebElement> list = se.getOptions();
		
		Iterable<WebElement> options = se.getOptions();
		
		for (WebElement e : options) {
			
			((ArrayList) temp).add(e.getText());

			System.out.println(temp);
		}
		*/
		
		
		
		

	}

}
