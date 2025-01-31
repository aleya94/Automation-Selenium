package HandleElementsSelen3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//TestNG

public class MyTest1 {
	
	@Test
	public void display()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals("Google1", title);
		
		
	}
	
	

}
