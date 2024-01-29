package ActionSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Game1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement element=	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//	actions.contextClick(element).perform();
//	element=driver.findElement(By.xpath("//span[contains(text(),'Quit')]"));
//	actions.contextClick(element).perform();
	element=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	actions.doubleClick(element).perform();
	Thread.sleep(3000);
	
	}

}
