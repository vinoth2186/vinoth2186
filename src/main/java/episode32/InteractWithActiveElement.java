package episode32;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithActiveElement {
	
	//We can interact with active element with the ACTIVEELEMENT() function without using the findelement

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement activeElement = driver.switchTo().activeElement();
		
		//We can send multiple parameter to SENDKEYS (Charsequence)
		activeElement.sendKeys("email",
				Keys.TAB,
				"Password",
				Keys.ENTER);

	}
}