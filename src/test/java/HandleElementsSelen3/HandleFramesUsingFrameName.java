package HandleElementsSelen3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesUsingFrameName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
	WebElement ele =	driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			
			ele.sendKeys("Aleya");
	}

}
