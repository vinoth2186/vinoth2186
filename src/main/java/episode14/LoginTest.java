package episode14;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://letcode.in");
		
		//Click on Login option
		driver.findElement(By.linkText("Log in")).click();
		
		//Enter email ID
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		
		//Enter Password
		
		driver.findElement(By.name("password")).sendKeys("testing");
		//Click Login button
		
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		
		driver.quit();
		
	}

}
