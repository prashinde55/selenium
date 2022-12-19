package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass2 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32//chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	 WebElement strelements = driver.findElement(By.xpath("//div[contains(text(),'alden@example.com')]"))	;
	
	strelements.click();
	
//	WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
//	
//		element.sendKeys("hello");
//		
	}
/// I ENTERED DIFFERENT XPATH IN FACEBOOK SO IT GAVE (" org.openqa.selenium.NoSuchElementException:)
	//OR
	// IF USE FINDELEMENTS METHOD SO I WILL GET "<LIST WEBELEMENT>" , IF I ENTERED DIFFERNT XPATH IN THAT 
	// IN GET METHOD IT WILL SHOW (ARRAYINDEX OUTBOUND EXCEPTION);
}


