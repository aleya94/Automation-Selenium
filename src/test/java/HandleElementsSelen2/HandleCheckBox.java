package HandleElementsSelen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
	
		
		WebElement ele1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		WebElement ele3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		
		//if (ele1.isEnabled() == true && ele1.isDisplayed() == true)
		//{
			ele1.click();
			ele2.click();
			ele3.click();
		//}
	}
}
