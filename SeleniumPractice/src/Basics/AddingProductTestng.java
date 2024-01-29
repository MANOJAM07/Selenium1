package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddingProductTestng {
	@Test
	public void addTOCart()
	{
		WebDriver driver=new ChromeDriver();
		
			driver.get("https://demowebshop.tricentis.com");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.className("email")).sendKeys("purohi@gmail.com");
			driver.findElement(By.className("password")).sendKeys("rohini@1");
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
			
			
		
	}

}
