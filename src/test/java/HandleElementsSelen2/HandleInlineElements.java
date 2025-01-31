package HandleElementsSelen2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleInlineElements {

	
	//any element present inside of any element
	//Span tag is used to group inline element in a document
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		WebElement ele= driver.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']"));
		
		if(ele.isDisplayed()== true && ele.isEnabled()==true)
		{
			ele.click();
		}
	
	}

}
