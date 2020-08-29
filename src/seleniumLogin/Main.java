package seleniumLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// Created by Prasanga Fernando
		//Orange HRM demo
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanga Fernando\\Documents\\Eclipse\\seleniumLogin\\seleniumLib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		String username = "admin";
		String password = "admin123";
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(currentURL.equalsIgnoreCase(expectedURL)) {
			System.out.println("Login successful");
		}
		
		else {
			System.out.println("Login unsuccessful");
		}
		
		try {
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		System.out.println("Browser closed");

	}

}
