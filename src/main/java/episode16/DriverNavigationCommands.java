package episode16;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Click on Home button and Go to home page
		
		String url = driver.getCurrentUrl();
		System.out.println("Button Page URL " + url);
		Thread.sleep(3000);
		
		driver.findElement(By.id("home")).click();
	
		//come back to buttons page using browser back button
		
		String homeurl = driver.getCurrentUrl();
		System.out.println("Home Page URL " + homeurl);
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("return to Button Page URL "+ driver.getCurrentUrl());
		Thread.sleep(3000);
		
		//Browser Refresh button verification
		driver.navigate().refresh();
		System.out.println("Stay in the same button page URL " +  driver.getCurrentUrl());
		Thread.sleep(3000);
		
		
		//Go to the different URL from browser address bar
		driver.navigate().to("https://letcode.in/signup");
		Thread.sleep(3000);
		driver.quit();
		
		//Forward URL from browser address bar
		driver.navigate().forward();
		System.out.println("return to Button Page URL "+ driver.getCurrentUrl());
		Thread.sleep(3000);

	}

}
