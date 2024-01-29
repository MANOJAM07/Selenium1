package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Digital')])[1]")).click();
         driver.findElement(By.xpath("(//input[contains(@class,'search')])[1]")).sendKeys("book");
         driver.findElement(By.xpath("(//input[contains(@class,'button')])[1]")).click();
         driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
         driver.close();
	}

}
