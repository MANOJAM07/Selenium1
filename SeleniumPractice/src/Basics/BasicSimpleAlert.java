package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BasicSimpleAlert {

	public static void main(String[] args) {
		
	
	String url="https://demowebshop.tricentis.com";
	WebDriver driver = new ChromeDriver();
SoftAssert softAssert=new SoftAssert();
	driver.get(url);
	softAssert.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.className("email")).sendKeys("purohi@gmail.com");
	driver.findElement(By.className("password")).sendKeys("rohini@1");
	driver.findElement(By.cssSelector(".button-1.login-button")).click();
	
	driver.quit();
	softAssert.assertAll();
}
}