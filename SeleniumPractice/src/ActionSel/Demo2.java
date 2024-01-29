package ActionSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement element=  driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));

Actions actions=new Actions(driver);
//actions.doubleClick(element).build().perform();

WebElement element2=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
actions.contextClick(element2).build().perform();
actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Copy')]"))).click().build().perform();
}
}
