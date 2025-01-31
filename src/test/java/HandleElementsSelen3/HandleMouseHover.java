package HandleElementsSelen3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("https://demoqa.com/menu/#"));
		
		WebElement ele = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("()"));
		

	}

}
