package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementsClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32//chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
 List<WebElement> data = driver.findElements(By.id("email"));
	System.out.println(data.size());
	
	WebElement ee = data.get(1);
	ee.sendKeys("hello");

	}

}
