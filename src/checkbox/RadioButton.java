package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='webform' and @value='Option 1']"));
		
		radio.click();
		
		driver.findElement(By.xpath("//input[@name='webform' and @value='Option 2']")).click();
		driver.findElement(By.xpath("//input[@name='webform' and @value='Option 2']")).click();
         driver.findElement(By.xpath("//input[@name='webform' and @value='Option 3']")).click();
	}


}
