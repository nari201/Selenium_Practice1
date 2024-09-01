package Practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_browsers {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main");
		
		Test_browsers b = new Test_browsers();
		b.scanner();

		
	}
	
	public void scanner() {
		
		Test_browsers b = new Test_browsers();
		 
		String demo ="demo";
		String flights="flights";
		
		System.out.println("Enter name :");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		if (name.equals(demo)) {
			
			System.out.println("calling...."+ name);
			
			b.Demo();
		}
		else if (name.equals(flights)) {
			
			System.out.println("calling...."+ name);
			b.flights();
			
		} 
		
  else {
			
			System.out.println("Enter valid name like 'demo','flights'");
			b.scanner();
		}
		
		
	}
	
	public void Demo() {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");
				driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
				
				driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();
				
				driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();
		

				System.out.println("Demo");
				
		
	}
	
	
public void flights() {
		
	System.out.println("flights");
		
		
	}

}
