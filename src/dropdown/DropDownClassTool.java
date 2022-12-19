package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownClassTool {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
	
	 driver.findElement(By.id("withOptGroup")).click();
	 
	 driver.findElement(By.xpath("//div[@id='withOptGroup']//input")).sendKeys("Gropup2, option 1");
	 driver.findElement(By.xpath("//div[@id='withOptGroup']//input")).sendKeys(Keys.ENTER);
	 
		

	
	

	}


}
