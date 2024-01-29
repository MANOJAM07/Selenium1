package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Fiction')])[1]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
	//	driver.findElement(By.xpath("(//a[contains(text(),'Fiction')])[1]/parent::h2/following-sibling::div[3]/child::div[2]")).click();
	}

}
