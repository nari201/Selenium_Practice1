package selenium_Phase2;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dynamic_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//SETTIPN//Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("test");
		
		System.out.println("Title :"+driver.getTitle());
	
		
		//java.util.List<WebElement> elementList= (List<WebElement>) driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']/descendant::div[@class='pcTkSc']/descendant::div[@class='wM6W7d']"));
	
		//System.out.println("Total Count "+elementList.size());
		
		//With FindElements Property
		
	//	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']"));
		
		List<WebElement> dElements = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='eIPGRd']//descendant::div[@class='pcTkSc']//descendant::div[@class='wM6W7d']"));
		
		System.out.println(dElements.size());
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Search name: ");
		//String v= scanner.next();
		
		String v ="testing";
		
		Thread.sleep(5000);
		
		
     for (int i=0; i<dElements.size(); i++) {
    	 
    	 if (dElements.get(i).getText().contains(v)) {
    		 
		 System.out.println("Clicking on :"+dElements.get(i).getText());
		 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		 WebElement el = wait.until(ExpectedConditions.elementToBeClickable( dElements.get(i)));
		 
		 el.click();
		 
		 
		 System.out.println("Clicked "+v);
		 
		 break;
    	 }
     
     }
     
 	//System.out.println(driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']/descendant::div[@class='pcTkSc']/descendant::div[@class='wM6W7d']")).getText());
    //ul[@role='listbox']//li/descendant::div[@class='eIPGRd']/descendant::div[@class='pcTkSc']/descendant::div[@class='wM6W7d']/descendant::span[text()='testing']
  		
     	
		
		
	}

}
