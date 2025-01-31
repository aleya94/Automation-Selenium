package HandleElementsSelen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleImage {

	public static void main(String[] args) {
	
		//Handling Image: 3 types 1)General Image(no Functionality), 2)Image Button(submits) 
		//3)Image Link(Directs to another page/location
		
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
			driver.manage().window().maximize();
			WebElement ele = driver.findElement(By.xpath("//input[@id='picture']"));
			ele.sendKeys("C:\\Users\\kwale\\OneDrive\\Pictures\\SEleniumLogo.png");
			
	}

}
