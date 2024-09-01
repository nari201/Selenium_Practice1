package action_Classes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C://Users//SETTIPN//Selenium_Files//chromedriver_win32/chromedriver.exe");
		System.out.println("Main");

		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);

		driver.get("http://demo.automationtesting.in/Register.html");  //https://jqueryui.com/droppable/
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	WebElement intra= driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/a"));
		
	WebElement dropdown = driver.findElement(By.xpath("\r\n" + 
				"//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));

	WebElement dynamic = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
	

	act.moveToElement(intra).moveToElement(dropdown).moveToElement(dynamic).click().build().perform();  // All Mouse actions in One syntax
	
	WebElement source = driver.findElement(By.xpath("//*[@id=\"angular\"]"));
	
	WebElement area = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div"));
	
	Thread.sleep(3000);
	
//	act.clickAndHold(source).moveToElement(area).release(area).build().perform();
	
	act.dragAndDrop(source, area).build().perform();  // Another method for drag and drop

	}

}
