package episode27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome", "./Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Single
		
		WebElement ele = driver.findElement(By.cssSelector("#fruits"));
		Select dropdownselect = new Select(ele);
		dropdownselect.selectByVisibleText("Apple");
		WebElement text1 = driver.findElement(By.xpath("//p[text()='You have selected Apple']"));
		String a = text1.getText();
		System.out.println(a);
		dropdownselect.selectByVisibleText("Mango");
		driver.findElement(By.xpath("//p[text()='You have selected Mango']"));
		
		//Single Selectbyvalue and print the value which is selected
		
		WebElement country = driver.findElement(By.id("country"));
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry = myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		//Multi Select
		
		WebElement heros = driver.findElement(By.id("superheros"));
		Select MyHeros = new Select(heros);
		boolean ismul = MyHeros.isMultiple();
		System.out.println("Is Multiple drop down : " + ismul);
		MyHeros.selectByIndex(1);
		MyHeros.selectByValue("bt");
		List<WebElement> allheros = MyHeros.getAllSelectedOptions();
		System.out.println("All the heros name selected>> : " + allheros);
		
		MyHeros.deselectByIndex(1);
	}

}
