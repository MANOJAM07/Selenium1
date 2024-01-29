package MultiWindow;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String parentString=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Twitter')]")).click();
		
	Set<String> childString=	driver.getWindowHandles();
	
	
	for(String windString:childString)
	{
		driver.switchTo().window(windString);
	
	if(!(driver.getTitle().equalsIgnoreCase("Demo Web Shop")))
	{
	
	
	driver.close();
	}	
	}
	Thread.sleep(1000);
	driver.switchTo().window(parentString);
   driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
   
	}
}

