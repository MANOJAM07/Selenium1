package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	
	//@Test(invocationCount = 3,threadPoolSize = 3)
	@Test
	public void login()
	{
	WebDriver driver=new ChromeDriver();
	Reporter.log("browser launched");
	
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("website is open");
			
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("rohini");
		driver.findElement(By.id("LastName")).sendKeys("s");
		driver.findElement(By.id("Email")).sendKeys("purohi@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rohini@1");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("rohini@1");
		driver.findElement(By.id("register-button")).click();

	}

}
