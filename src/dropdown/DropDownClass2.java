package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe")	;	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		Select sele=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		
		boolean sele1 = sele.isMultiple();
		System.out.println(sele1);
		
	sele.selectByVisibleText("Apple");
	sele.selectByVisibleText("Grape");
	sele.selectByVisibleText("Apple");// on Double select it will not unSelect
	
	sele.selectByVisibleText("Orange");
	
	sele.deselectByIndex(2);
	sele.deselectByVisibleText("Orange");
	
		sele.deselectAll();
	}

}
