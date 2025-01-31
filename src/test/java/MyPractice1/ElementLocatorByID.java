package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorByID {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.id("Email"));
		
		//driver= is object
		//findElement= WebDriver method
		//By = pre-defined Class
		//id = Element locator
		//Email= id locator value
		
		driver.findElement(By.id("Email")).sendKeys("USA");
		
		//or
		
		WebElement Email =driver.findElement(By.id("Email"));
		Email.sendKeys("USA");
		
		//id locator for button
		WebElement Email2 = driver.findElement(By.id("signIn"));
		Email2.click();
		
		//or
		driver.findElement(By.id("signIn")).click();
	}

}
