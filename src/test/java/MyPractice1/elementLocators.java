package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementLocators {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		//Name
		driver.findElement(By.name("Email")).sendKeys("USA");
		
		//className
		driver.findElement(By.className("textboxcolor")).sendKeys("Alabama");
		
		//tagName
		driver.findElement(By.tagName("input")).sendKeys("Florida");
		
		//linkText
		driver.findElement(By.linkText("Gmail")).click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Gma")).click();
		
		//cssSelector
		driver.findElement(By.cssSelector(".gb_m")).click();
		
		//xpath- in XML docu shows the direction of software web app ele location
		driver.findElement(By.xpath("//*'[@id=Email]")).sendKeys("abcdef");
	}

}
