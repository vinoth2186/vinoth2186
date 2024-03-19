package episode28;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get text
		WebElement header = driver.findElement(By.tagName("h1"));
		String headertxt = header.getText();
		System.out.println(headertxt);
		String Signuptxt = driver.findElement(By.xpath("//div[@class='buttons']//a[1]")).getText();
		System.out.println(Signuptxt);
		String completetxt = driver.findElement(By.xpath("(//div[@class='card-content'])[1]")).getText();
		System.out.println(completetxt);
		
		
		//get attribute to get the inner text and //****Learn quit or close*****
		//to kill the task in task manager using cmd(command prompt} ----/f /im chromedriver.exe
		
		String attribtetext = driver.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println(attribtetext);
		
		String attribtetext1 = driver.findElement(By.id("join")).getAttribute("value");
		System.out.println(attribtetext1);
				
		//driver.close ***It will not close the chromedriver.exe in task manager...We have to manually kill the task in task manager
		
		driver.get("https://letcode.in/edit");
		//driver.close();
		driver.quit();
		
		
	}

}
