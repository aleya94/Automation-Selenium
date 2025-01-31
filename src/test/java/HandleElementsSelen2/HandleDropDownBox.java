package HandleElementsSelen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 types: static(selectClass), dynamic, auto

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='state']"));
		
		Select oselect=new Select(ele);
		oselect.selectByIndex(3);
		
			ele.click();
	}

}
