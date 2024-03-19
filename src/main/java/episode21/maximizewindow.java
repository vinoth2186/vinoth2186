package episode21;

import org.openqa.selenium.chrome.ChromeDriver;

public class maximizewindow {
	public static void main(String[] args) {
		System.getProperty("WebDriver.driver.chromedriver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Write a code to Maximize and Minimize a browser window
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("\"https://letcode.in");
	}

}
