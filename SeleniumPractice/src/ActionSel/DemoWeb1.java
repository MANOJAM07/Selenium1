package ActionSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWeb1 {
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		
		actions.moveToElement(element).perform();
		actions.doubleClick(driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"))).perform();
		
	}

}
