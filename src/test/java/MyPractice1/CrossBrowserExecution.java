package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {

	
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser )
	{
	if(browser.equalsIgnoreCase("firefox"))
	{
	driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
	driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
	driver=new EdgeDriver();
	}
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
	driver.get("https://grotechminds.com/rightclick/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement ele= driver.findElement(By.xpath("//a[text()='Practice Link6']"));
	Thread.sleep(3000);
	act.contextClick(ele).build().perform();
	}
	

	
	
	
	

}
