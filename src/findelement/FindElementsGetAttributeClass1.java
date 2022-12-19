package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsGetAttributeClass1 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32//chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement emailtext = driver.findElement(By.id("email"));
		 
	String name = emailtext.getAttribute("placeholder");
	
System.out.println(name);
		
		
		

	}

}
