package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClass3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/radio.html");
			
		 WebElement radio = driver.findElement(By.xpath("//input[@name='gfdgj,gvkjggghkblhlvjn11212121']"));
			// Here i entered Wrong Xpath and it show 
		 // so it show Exception ="" org.openqa.selenium.NoSuchElementException:"
		 radio.click();
			
			boolean radiodis = radio.isDisplayed();	
			System.out.println(radiodis);
			
	  	boolean radioSele = radio.isSelected();
			
	     System.out.println(radioSele);

			
		}

}
