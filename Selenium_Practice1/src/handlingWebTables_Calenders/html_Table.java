package handlingWebTables_Calenders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Main Method");

		// driver.get("http://newtours.demoaut.com/");

		driver.get("file:///C:/Users/91810/eclipse-workspace/Selenium_p1/WebContent/HtmlTable.html");

		driver.manage().window().maximize();

		int r = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("No of rows: " + r);

		int c = driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		System.out.println("No of cols: " + c);

		for (int i = 2; i <= r; i++) {

			for (int k = 1; k <= c; k++) {

				String v= driver.findElement(By.xpath("\r\n" + "/html/body/table/tbody/tr["+i+"]/td["+k+"]")).getText();
				
				System.out.print(v+"  ");
				
			}
			System.out.println();

		}
		
		driver.close();

	}

}
