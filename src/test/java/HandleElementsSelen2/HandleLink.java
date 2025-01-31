package HandleElementsSelen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLink {

	public static void main(String[] args) {
	
				//Handling Links
				
				WebDriver driver = new ChromeDriver();
		
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				
			
				WebElement ele = driver.findElement(By.xpath("(//a[@class='gb_W])[2]"));
				
				
				if(ele.isDisplayed()==true && ele.isEnabled()==true)
				{
					ele.click();
				}

	}

}
