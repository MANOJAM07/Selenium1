package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragClick {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions actions=new Actions(driver);
	
WebElement wash=	driver.findElement(By.id("box3"));
WebElement usa=driver.findElement(By.id("box103"));

WebElement rome=driver.findElement(By.id("box6"));
WebElement italy=driver.findElement(By.id("box106"));
	
WebElement madrid=driver.findElement(By.id("box7"));
WebElement spain=driver.findElement(By.id("box107"));

WebElement seul=driver.findElement(By.id("box5"));
WebElement southKoria=driver.findElement(By.id("box105"));

WebElement capeh=driver.findElement(By.id("box4"));
WebElement denmark=driver.findElement(By.id("box104"));
WebElement        stockholm=driver.findElement(By.id("box2"));
 WebElement       sweden=driver.findElement(By.id("box102"));
 
 WebElement        oslo=driver.findElement(By.id("box2"));
 WebElement       norway=driver.findElement(By.id("box102"));
 

	actions.dragAndDrop(wash, usa);
	actions.dragAndDrop(oslo, norway);
	actions.dragAndDrop(stockholm, sweden);
	actions.dragAndDrop(capeh, denmark);
	actions.dragAndDrop(seul, southKoria);
	actions.dragAndDrop(madrid, spain);
	actions.dragAndDrop(rome, italy);
	
}
}
