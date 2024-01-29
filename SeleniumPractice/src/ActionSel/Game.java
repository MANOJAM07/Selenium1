package ActionSel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Game {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actions=new Actions(driver);
		WebElement capitalElement=driver.findElement(By.id("box6"));
		WebElement counElement=driver.findElement(By.id("box106"));
		
		//actions.clickAndHold(capitalElement).dra8
		actions.dragAndDrop(capitalElement, counElement).build().perform();
		
//		WebElement capitalElement1=driver.findElement(By.id("box7"));
//		WebElement counElement1=driver.findElement(By.id("box107"));
//		actions.dragAndDrop(capitalElement1, counElement1).perform();
//		
//		WebElement capitalElement2=driver.findElement(By.id("box5"));
//		WebElement counElement2=driver.findElement(By.id("box105"));
//		actions.dragAndDrop(capitalElement2, counElement2).perform();
//		
//		WebElement capitalElement3=driver.findElement(By.id("box4"));
//		WebElement counElement3=driver.findElement(By.id("box104"));
//		actions.dragAndDrop(capitalElement3, counElement3).perform();
//		
//		WebElement capitalElement4=driver.findElement(By.id("box3"));
//		WebElement counElement4=driver.findElement(By.id("box103"));
//		actions.dragAndDrop(capitalElement4, counElement4).perform();
//		
//		WebElement capitalElement5=driver.findElement(By.id("box2"));
//		WebElement counElement5=driver.findElement(By.id("box102"));
//		actions.dragAndDrop(capitalElement5, counElement5).perform();
//		
//		WebElement capitalElement6=driver.findElement(By.id("box1"));
//		WebElement counElement6=driver.findElement(By.id("box101"));
//		actions.dragAndDrop(capitalElement6, counElement6).perform();
//		
//		WebElement capitalElement7=driver.findElement(By.id("box7"));
//		WebElement counElement7=driver.findElement(By.id("box107"));
//		actions.dragAndDrop(capitalElement7, counElement7).perform();
//		
//		
		
		
 	}

}
