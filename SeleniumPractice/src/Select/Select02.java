package Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("com");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(Keys.ARROW_DOWN);
	WebElement e=	driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	e.sendKeys(Keys.ARROW_DOWN);
	e.sendKeys(Keys.ENTER);
	driver.close();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Build your own expensive computer')]")).sendKeys(Keys.ENTER);
	}

}
