package episode22;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("emai")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		driver.quit();
		
		
		
		

	}

}
