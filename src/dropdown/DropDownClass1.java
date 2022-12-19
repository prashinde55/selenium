package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe")	;	
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://demoqa.com/select-menu");
		// THERE IS SELECT CLASS WHICH WE HAVE TO USE
		Select sele=new Select( driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
				
			sele.selectByVisibleText("Green");
			sele.selectByValue("5");
			sele.selectByIndex(0);
			
			
			sele.deselectByVisibleText("Green"); // WE CANNNOT DESELECT THIS TEXT;
			
			
			}

}
