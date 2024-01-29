package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogout {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("purohi@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohini@1");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();////input[@value='Log in']
	}

}
