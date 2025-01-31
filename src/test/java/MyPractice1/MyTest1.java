package MyPractice1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
WebElement ele=	driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
ele.sendKeys("Java Selenium");

	}

}
