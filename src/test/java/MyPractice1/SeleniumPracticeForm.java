package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumPracticeForm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//1 link
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		//get the title of the web page
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		//get the url of current web page
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		
		
		//2 text box first name
		WebElement ele = driver.findElement(By.xpath("//input[@name='firstname']"));
		ele.click();
		ele.sendKeys("Aleya");
		
		//2 text box last name
		WebElement ele2 = driver.findElement(By.xpath("//input[@name='lastname']"));
		ele2.click();
		ele2.sendKeys("Begum");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)","");

		
		//3 select radio buttons- Gender 
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='sex-1']"));
		if (ele3.isEnabled() == true && ele.isDisplayed() == true)
		{
			ele3.click();
			
		}
		
		Thread.sleep(3000);
				
		//3 select radio buttons- Years of experience
		WebElement ele4 = driver.findElement(By.xpath("//input[@id='exp-2']"));
			ele4.click();
	
			Thread.sleep(3000);
			
		//5 Enter date - date picker
		WebElement ele5 = driver.findElement(By.xpath("//input[@id='datepicker']"));
		ele5.click();
		ele5.sendKeys("10/23/2024");
		Thread.sleep(3000);
		
		//6 Select Profession (Checkbox)
		WebElement ele6 = driver.findElement(By.xpath("//input[@id='profession-0']"));
		WebElement ele7 = driver.findElement(By.xpath("//input[@id='profession-1']"));
		ele6.click();
		ele7.click();
		Thread.sleep(3000);
		
		//7 multiple check box Automation tool
		WebElement ele8 = driver.findElement(By.xpath("//input[@id='tool-0']"));
		WebElement ele9 = driver.findElement(By.xpath("//input[@id='tool-2']"));
		ele8.click();
		ele9.click();
		
		Thread.sleep(3000);
		
		// select box Continent
		driver.findElement(By.id("continents"));
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='continents'][0]"));
		dropdown1.click();
		
		Thread.sleep(3000);
		
		//multi select box- Selenium commands
		WebElement dropdown2 = driver.findElement(By.id("selenium commands"));
		dropdown2.findElement(By.xpath("//option[]"));
		dropdown2.click();
		
		
		//Upload image button
		WebElement ele11 = driver.findElement(By.xpath("//input[@id='photo']"));
		ele11.sendKeys("C:\\Users\\kwale\\OneDrive\\Pictures\\SEleniumLogo.png");
		
		
		
		//download link
		WebElement downloadFile= driver.findElement(By.xpath("//span[@style='margin:0;padding:0']"));
		downloadFile.click();
		
		
		//submit button
		WebElement ele13= driver.findElement(By.xpath("//button[@'class=btn btn-info']"));
		ele13.click();
		
		driver.close();
		
		
		
		

	}

}
