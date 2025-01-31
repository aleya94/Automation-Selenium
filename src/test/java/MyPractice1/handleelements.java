package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleelements {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement downloadFile= driver.findElement(By.xpath("//a[href='https://github.com/stanfy/behave-rest/blob/master/features/conf.yaml']"));
		downloadFile.click();
		
	}

}
