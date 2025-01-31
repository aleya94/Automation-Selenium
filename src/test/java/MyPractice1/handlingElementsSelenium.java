package MyPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingElementsSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		String WindowHandle = driver.getPageSource();
		System.out.println(WindowHandle);
		
		driver.close();
		driver.quit();
		
		
		
		//public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("http://login.yahoo.com");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
	
			
		}
		
		
		

	}

