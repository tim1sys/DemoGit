package myfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		// i added a comment 
				// i added a comment 
				// i added a comment 
				// i added a comment 
		
		
		
		// TODO Auto-generated method stub
		//question
		/*
		 * Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

			How to get the Count of number of check boxes present in the page
		
		// i added a comment // i added a comment // i added a comment 
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		//to count number of checkboxes in a page 
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("timigon");
		driver.findElement(By.name("email")).sendKeys("timigon@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("timigon");
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select drop= new Select(dropdown);
		drop.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("08/29/1998");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
