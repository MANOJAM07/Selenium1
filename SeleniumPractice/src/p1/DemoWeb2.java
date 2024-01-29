package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Black')]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
		
		
	}

}
