package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass2 {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
	WebElement check = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		
		check.click();
		
		boolean disp = check.isDisplayed();   // "is " word comes in any method then it return in boolean only
 System.out.println(disp);
 
 boolean enable = check.isEnabled();
  System.out.println(enable);
  
 boolean sele = check.isSelected();
  
 System.out.println(sele);
 
 
 
 
 check.click();
 
 boolean sele1 = check.isSelected();
 System.out.println(sele1);
 
 boolean enable1 = check.isEnabled();
 System.out.println(enable1);
 
	}


}
