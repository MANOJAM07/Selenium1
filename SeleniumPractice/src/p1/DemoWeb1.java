package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb1 {

	public static void main(String[] args) {
 
		WebDriver driver=new ChromeDriver();
		//apparel selection
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Digital')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'3rd ')]//parent::h2/following-sibling::div[3]/child::div/following-sibling::div/child::input")).click();
	}

}
