package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();  // by using this step window will be full screen
	
	driver.get("https://www.facebook.com/");
	
	WebElement emailtextbox = driver.findElement(By.name("email"));
	emailtextbox.sendKeys("hello");
	emailtextbox.clear();
	
	emailtextbox.sendKeys("india");
	

	}


}
