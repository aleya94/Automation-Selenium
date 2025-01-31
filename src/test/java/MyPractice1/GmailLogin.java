package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//writing first selenium test case for gmail login

public class GmailLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Launches Chrome Browser with blank url
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.name("username")).sendKeys("janbask.qa");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tab1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.equals("https://mail.google.com/mail/u/0/#inbox")) {
			System.out.println("Login Successful-Passed");
		}
		else
		{System.out.println("Login Unsuccessful-Failed");
		
		}
		
		driver.close();

	}

}
