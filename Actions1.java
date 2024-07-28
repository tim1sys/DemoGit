package myfirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.indeed.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// use actions of mouse over create object for action method
		Actions d = new Actions(driver);
		WebElement move= driver.findElement(By.id("text-input-where"));
		
		d.moveToElement(driver.findElement(By.id("text-input-what"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
		 d.moveToElement(move).click().contextClick().build().perform(); //contextclick is right click
		
		
	}

}
