package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass1 {

	public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	

	driver.get("https://demo.guru99.com/test/radio.html");
	
	//driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
	  WebElement check = driver.findElement(By.xpath("//input[@value='checkbox3']"));
	  //check.click();
	 boolean displ = check.isDisplayed();
System.out.println(displ);
              boolean sele = check.isSelected();
System.out.println(sele);

	
	checkOrUncheckCheckBox(driver,By.xpath("//input[@value='checkbox3']"),true);
	
}
public static void checkOrUncheckCheckBox(WebDriver driver,By locatar, boolean checkedflag) {
		
		if(checkedflag==false) {
			 driver.findElement(By.xpath("//input[@value='checkbox3']"));
		}
	
		else {
			 driver.findElement(By.xpath("//input[@value='checkbox3']")).click();	
		}
	
}

}
