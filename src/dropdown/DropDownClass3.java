package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass3 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32//chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select sele= new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		
		sele.selectByVisibleText("Orange");
		sele.selectByVisibleText("Banana");
		sele.selectByIndex(1);
		
		
	List<WebElement> AllOpt = sele.getOptions();
		
		System.out.println(AllOpt.size());
		
		for(WebElement each:AllOpt) {
			
			
			System.out.println(each.getText());
			
		}
		
		List<WebElement> AllSelOp = sele.getAllSelectedOptions();
		
		System.out.println(AllSelOp);
		
		for(WebElement each:AllSelOp) {
			System.out.println(each.getText());
			
		}
	WebElement FirstOption = sele.getFirstSelectedOption();
	String FirstOp = FirstOption.getText();
		
		System.out.println(FirstOp);
		
		
		
		
		
		
		
		
		
		
	}


}
