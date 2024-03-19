package episode18;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chorme",".Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Take screenshot of the page
		
		File firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/imp.png");
		FileHandler.copy(firstsrc, dest);
		
		//Take screenshot of the button in the page
		
		WebElement ele = driver.findElement(By.id("home"));
		File btnsrc = ele.getScreenshotAs(OutputType.FILE);
		File btndest = new File("./snap/impbtn.png");
		FileHandler.copy(btnsrc, btndest);
		
		//Take screenshot of the section in the page
		
		WebElement elem = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/div/div"));
		File elemsrc = elem.getScreenshotAs(OutputType.FILE);
		File elemest = new File("./snap/impelem.png");
		FileHandler.copy(elemsrc, elemest);
		
		driver.quit();
	}

}
