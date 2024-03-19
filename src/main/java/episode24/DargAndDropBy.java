package episode24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargAndDropBy {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.driver.chrome","./Drivers.chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		int x= ele.getLocation().getX();
		int y = ele.getLocation().getY();
		builder.dragAndDropBy(ele, x+70, y+90).perform();
		

	}

}
