package javaScript_Executer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JS_Util {


	public static void flash (WebElement element , WebDriver driver ) {
		
		System.out.println("called Flash");
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		String Bgcolor = element.getCssValue("backgroundColor");
		
		for (int i= 0; i< 300 ;i++) {
			
			changeColor ( "#000000", element, driver); 
			changeColor ( Bgcolor, element, driver); 
			
		}
	}


	private static void changeColor(String color, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript("arguments[0].style.backgroundColor ='" + color+ "'", element);
		
	}
	
	public static void Drawborder(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript("arguments[0].style.border ='3px solid red'", element);
		
	}
	
	public static String GetTitle (WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		String title = js.executeScript("return document.title;").toString();
		
		return title;
		
	}
	
	public static void Click_JS (WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript("arguments[0].click()", element);
		
	}
	
	public static void GetAlert ( WebDriver driver, String message) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript("alert('"+message+"')");
		
	}
	public static void Refresh_js ( WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript(" history.go[0]");
		
	}
	public static void scrollIntoView ( WebElement element,WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public static void scrollIntoDown ( WebElement element,WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver ;	
		
		js.executeScript(" ", element);
		
	}
	
}
