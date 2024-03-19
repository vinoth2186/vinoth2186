package episode40;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
		}
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println("Rows size: "+size);
		if(size == 3) {
			System.out.println("Pass");
		}else System.out.println("fail");
		/*for (WebElement row : allrows) {
			List<WebElement> colums = row.findElements(By.tagName("td"));
			WebElement firstColumn = colums.get(0);
			System.out.println(firstColumn.getText());
		}				
		 */
		for (int i = 0; i < size; i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();
			System.out.println(text);
			if(text.equals("Chatterjee")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				input.click();
				break;
			}
			
		}
		
		
		
//		driver.quit();
	}
	
}