package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSS_Class {
	public static void main(String[] args) {
		// full form of CSS is "Cascading Style sheets"
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32//chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
WebElement text = driver.findElement(By.xpath("//h2[contains(text(),' helps you connect and share with')]"));
		
	String str = text.getCssValue("font-size");
		System.out.println(str);
		
     String str2 = text.getCssValue("font-family");
     System.out.println(str2);
     
    String str3 = text.getCssValue("width");
    System.out.println(str3);
    
    
	}


}
