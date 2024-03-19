package testngbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Get the X & Y Coordinates
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("Get the X = >>" + x + "Get the Y = >>"+y);
		//Find the color of the butto
		WebElement btncolor = driver.findElement(By.id("color"));
		String buttoncolor = btncolor.getCssValue("background-color");
		System.out.println(buttoncolor);
		
		//FInd the height and width of the button
		Rectangle heightWidth = driver.findElement(By.id("property")).getRect();
		int h = heightWidth.height;
		int w = heightWidth.width;
		System.out.println("Height of the button: " + h + "Width of the button: 	" + w);
		
		
		//Confirm button is disabled
		
		boolean a  = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(a);
		


	}

}
