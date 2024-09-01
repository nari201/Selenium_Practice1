package dropDowns;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//SETTIPN//Selenium_Files//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		System.out.println("Main");

		driver.get("http://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.id("animals"));
		
		System.out.println(name.getText());

		Select se = new Select(name);
		
	se.selectByVisibleText("Baby Cat");
	
	/**	ArrayList Original = new ArrayList();
		ArrayList templist = (ArrayList) new ArrayList();

		Iterable<WebElement> options = se.getOptions();

		for (WebElement e : options) {

			((ArrayList) Original).add(e.getText());

			templist.add(e.getText());
		}

		//System.out.println(Original);


		//templist = Original;

		System.out.println("Before Sort OrginalList " + Original);
		System.out.println("Before Sort" + templist);

		Collections.sort(templist);
		System.out.println("After Sort tempList " + templist);
		
		Collections.sort(Original);
		System.out.println("After Sort OrginalList " + Original);
		
		// After Sort Original List also will change as templist
		
		if (templist.equals(Original)) {
			
			System.out.println("Drop down Sorted");
		}else {
			System.out.println("Drop Down not sorted");
		}
		
		**/
	}

}
