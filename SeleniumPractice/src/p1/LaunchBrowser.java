package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {

	//7
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
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
