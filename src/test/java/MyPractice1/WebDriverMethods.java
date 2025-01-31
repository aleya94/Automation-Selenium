package MyPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		//get()
		driver.get("https://www.w3schools.com");
		
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//getTitle()
		driver.get("https://www.w3schools.com/java/");
		String Title = driver.getTitle();
		System.out.println("Title");
		
		//getPageSource() will give you the entire page
		
		//getCurrentUrl()
		
		//navigate().to()
		
		//navigate().back()
	
		
		//navigate().forward()
		
		//navigate().refresh()
		
		//close()
		
		//quit()
		
		//findElement()
		
		//sendKeys()
		
		//clear()
		
		//click()
		
		//isEnabled()
		
		//isDisplayed()
		
		//isSelected()
		
		//manage().window().maximize()
		
		//windowHandle()

	}

}
