package ActionSel;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
	WebElement element=	driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
		actions.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')])[1]"))).click().perform();
	
		
//		WebElement element2=driver.findElement(By.id("small-searchterms"));
//	actions.moveToElement(element2).click().keyDown(Keys.SHIFT).sendKeys("mobie").keyUp(Keys.SHIFT).perform();
	
	}

}
