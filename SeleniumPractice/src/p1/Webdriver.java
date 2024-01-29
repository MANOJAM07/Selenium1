package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]")).click();
		String string=driver.findElement(By.xpath("(//span[@class='price actual-price'])[1]")).getText();
		System.out.println("price= "+string);
	}

}
