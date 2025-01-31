package HandleElementsSelen3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingE2ETestCase {

	public static void main(String[] args) throws InterruptedException {
		
		//1) do the negative test case with empty value
		
		WebDriver driver =new ChromeDriver(); //initialize the driver
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@name='password']"));
		
		if(ele.isDisplayed()== true && ele.isEnabled()==true)
		{
			ele.click();
		}
		
		
		if(ele.isDisplayed()== true && ele.isEnabled()==true)
		{
			ele2.click();
		}
		
		
		String message1 = driver.findElement(By.xpath("//label[@id='message23']")).getText();
		String message2 = driver.findElement(By.xpath("//label[@id='message18']")).getText();
		System.out.println(message1);
		System.out.println(message2);
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		
		
		//2) incorrect ID and password with wrong value
		
		WebDriver driver2 =new ChromeDriver();
		driver2.get("https://demo.guru99.com/V4/index.php");
		driver2.manage().window().maximize();
		WebElement ele3 = driver2.findElement(By.xpath("//input[@name='uid']"));
		WebElement ele4 = driver2.findElement(By.xpath("//input[@name='password']"));
		
		Thread.sleep(5000);
		ele3.sendKeys("mngr597920");
		ele4.sendKeys("rYhamEr");
		Thread.sleep(3000);
		WebElement ele5= driver2.findElement(By.xpath("//input[@name='btnLogin']"));
		
		if(ele5.isDisplayed()== true && ele5.isEnabled()==true)
		{
			ele5.click();
		}
		driver2.switchTo().alert().accept();
		Thread.sleep(5000);
		driver2.quit();
		
		
		//3) Login with correct ID and Password (positive test case)
		
		WebDriver driver3 =new ChromeDriver();
		driver3.get("https://demo.guru99.com/V4/index.php");
		driver3.manage().window().maximize();
		WebElement ele6 = driver3.findElement(By.xpath("//input[@name='uid']"));
		WebElement ele7 = driver3.findElement(By.xpath("//input[@name='password']"));
		WebElement ele8= driver3.findElement(By.xpath("//input[@name='btnLogin']"));
		
		ele6.sendKeys("mngr597924");
		ele7.sendKeys("rYhamEr");
		Thread.sleep(3000);
		ele8.click();
		
		//check if the login page is correct or not
		
		String Title= driver3.getTitle();
		System.out.println(Title);
		if(Title.contains("Guru99"))
		{
			System.out.println("Test Case passed");
		}
			
		//logout from the application
		
		driver3.findElement(By.xpath("//a[@href='Logout.php']")).click();
		driver3.switchTo().alert().accept();
		
		

	}

}
