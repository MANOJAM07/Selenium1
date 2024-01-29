package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
			
	WebElement comp=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
WebElement ele=	driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
	//comp.click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele);
		ele.click();
	//	actions.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")));
		//System.out.println(comp.isDisplayed());
		
	}

}
