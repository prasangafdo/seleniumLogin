package seleniumLogin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanga Fernando\\Documents\\Eclipse\\seleniumLogin\\seleniumLib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Handle window popup (Alert box)
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println(alertText);
		
		alert.accept();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String alertText2 = alert2.getText();
		System.out.println(alertText2);
		Thread.sleep(5000);
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		
		System.out.println(alertText2);
		Thread.sleep(5000);
		alert.dismiss();
		
		Thread.sleep(5000);
		driver.close();
		
		//Image getText
		//drop down
		
		//HTML table
		
		//Handle inline elements
		
		

	}

}
