package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsClass2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32//chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	 List<WebElement> element = driver.findElements(By.xpath("//form//div//input"));
	
	
    element.get(0).sendKeys("hello ");
    element.get(1).sendKeys("goodmorning");
	
	
	}

}
