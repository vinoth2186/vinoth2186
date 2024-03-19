package episode19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		
		//access to the SIMPLE Alert popup window and use 'accept'
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Show the text in the alert>> : "+ text);
		alert.accept();
		
				
		//access to the SIMPLE Alert popup window and use 'dismiss'
		driver.findElement(By.id("accept")).click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println("Show the text in the alert>> : "+ text1);
		alert1.dismiss();
		//Thread.sleep(10000);
				
		//access to the CONFIRM Alert popup window and use 'accept'
		driver.findElement(By.id("confirm")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println("Show the text in the alert>> : "+ text2);
		alert2.accept();
		
		//access to the PROMPT Alert popup window and use 'accept'
		
		driver.findElement(By.id("prompt")).click();
		Alert alert3 = driver.switchTo().alert();
		String text3 = alert3.getText();
		System.out.println(text3);
		alert3.sendKeys("Vinoth");
		alert3.accept();
		//Thread.sleep(10000);
		String nametext = driver.findElement(By.id("myName")).getText();
		System.out.println(nametext);
		
		
		//SWEET ALERT is nothing but the user defined alert page and it can handled like other web pages. we dont need alert function
		WebElement elebtn = driver.findElement(By.id("modern"));
		boolean displaybtn = elebtn.isDisplayed();
		System.out.println(displaybtn);
		elebtn.click();
		String superalerttxt = driver.findElement(By.className("card-content")).getText();
		System.out.println(superalerttxt);
		driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
		driver.quit();		
	}

}

//AlertException
//unhandledalertexception, Noalertpresentexception
