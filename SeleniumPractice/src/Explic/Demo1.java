package Explic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Search']"))));
		driver.close();
	}

}
