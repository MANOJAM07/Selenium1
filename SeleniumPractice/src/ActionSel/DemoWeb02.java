package ActionSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWeb02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		driver.get("https://demowebshop.tricentis.com/");
	WebElement element=	driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("comp").keyUp(Keys.SHIFT).perform();
	element=driver.findElement(By.xpath("//a[contains(text(),'Copy of Computing and Internet EX')]"));   
		actions.moveToElement(element).click().perform();	
	}

}
