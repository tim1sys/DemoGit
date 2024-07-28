package myfirst;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// using xplicit wait

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select drop = new Select(options);

		drop.selectByIndex(2);

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.navbar-brand")));
	
		
	// create list i need to add to cart nAMES 
		String [] productNames= {"iphone X","Nokia Edge"};
		
		// get my string names for products in a list 
		List<WebElement> products= driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		// get the buttons to be used in one 
		List<WebElement> buttonAdd = driver.findElements(By.xpath("//button[@class='btn btn-info']"));

		for (int i = 0; i < buttonAdd.size(); i++) {
			
			String name = products.get(i).getText();
			
			List productNamesList = Arrays.asList(productNames);
			
			if(productNamesList.contains(name)) {
				
			buttonAdd.get(i).click();
		}
		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		// driver.findElement(By.cssSelector("button.btn.btn-success")).click();
	}

}
