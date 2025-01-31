package HandleElementsSelen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Handling Radio Button
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='gender']"));
		if (ele.isEnabled() == true && ele.isDisplayed() == true)
		{
			ele.click();
		}
	}
}
