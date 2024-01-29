package MultiWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String parentString=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Twitter')]")).click();
		
	Set<String> childString=	driver.getWindowHandles();
	
	
	for(String windString:childString)
	{
		driver.switchTo().window(windString);
	
	if(!(driver.getTitle().equalsIgnoreCase("Demo Web Shop"
			+ "")))
	{
	
	
	driver.close();
	}	
	}
	}
}
