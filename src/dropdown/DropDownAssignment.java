package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAssignment {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
	WebElement drop = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));

 drop.sendKeys("Green");
	drop.sendKeys(Keys.ENTER);
	drop.sendKeys("Blue");
	drop.sendKeys(Keys.ENTER);
	
	
//		sele.selectByVisibleText("Green");
//		sele.selectByValue("2");
//		sele.selectByIndex(1);
  
		
//		List<WebElement> selOpt = sele.getOptions();
//		
//		for(WebElement each:selOpt) {
//			
//			System.out.println(each);
		}

}
