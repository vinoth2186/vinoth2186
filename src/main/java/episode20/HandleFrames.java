package episode20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IFRAME through indexing syntax
		
		System.setProperty("WebDriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//String currentpageurl = driver.getCurrentUrl();
		//System.out.println(currentpageurl);
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Vinoth");
		driver.findElement(By.name("lname")).sendKeys("Kumar");
		WebElement ele= driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div[1]/p"));
		String text = ele.getText();
		System.out.println(text);
		
		//IFRAME navigation through xpath;
		
		driver.navigate().refresh();
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(frameelement);
		driver.findElement(By.name("fname")).sendKeys("Lakshitha");
		driver.findElement(By.name("lname")).sendKeys("V");
		WebElement ele1= driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div[1]/p"));
		String text1 = ele1.getText();
		System.out.println(text1);
		
		//Moving to child frame from the parent
		WebElement frameelement1 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frameelement1);
		driver.findElement(By.name("email")).sendKeys("vtest@gmail.com");
		
		//Navigate to the Parent FRAME from the child. It will always go one frame above
		
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("inoth");
		
		////Navigate to the default Webpage from the child/parent frames.
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a")).click();
		
}

}
