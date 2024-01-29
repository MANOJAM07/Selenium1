package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData {

	@Test(dataProvider = "test")
	public void login(String userName, String password) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys(userName);
		driver.findElement(By.className("password")).sendKeys(password);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
//		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
//	

	}

	@DataProvider(name = "test")
	public Object[][] testData() {
		int row = 3;
		int column = 2;
		String[][] data = new String[row][column];
		data[0][0] = "purohi@gmail.com";
		data[0][1] = "rohini@1";
		data[1][0] = "tanoj";
		data[1][1] = "4321";
		data[2][0] = "Surya";
		data[2][1] = "4567";
		return data;

	}

}
