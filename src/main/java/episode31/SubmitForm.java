package episode31;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitForm {

	
	//Submit function will only work in Form DOM and it wont work in other areas. We can use Submit instead of CLICK wherever we have form Submit
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElementByName("")
		driver.findElement(By.name("email")).sendKeys("vinoth@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).submit();
	}
}