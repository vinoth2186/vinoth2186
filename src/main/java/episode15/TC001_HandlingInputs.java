package episode15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_HandlingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch Browser
		
				ChromeDriver driver = new ChromeDriver();
				
				//Load the URL
				driver.get("https://letcode.in/edit");
				
				//Enter your full name
				
				driver.findElement(By.id("fullName")).sendKeys("TestVin");
				
				//Append a text and Press TAB keyboard key
				driver.findElement(By.id("join")).sendKeys(" Person", Keys.TAB);
				
				//What is inside the textbox
				
				String myName = driver.findElement(By.id("getMe")).getAttribute("value");
				System.out.println(myName);
				
				//Clear the text
				
				driver.findElement(By.id("clearMe")).clear();
				
				//Confirm edit field is disabled
				
				boolean Isedit = driver.findElement(By.id("noEdit")).isEnabled();
				System.out.println(Isedit);
				
				//Confirm text is readonly
				
				String isreadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
				System.out.println(isreadonly);
				driver.quit();
				
				
	}

}
