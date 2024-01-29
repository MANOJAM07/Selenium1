
package MultiWindow;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Manoj/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		Set<String> childString=driver.getWindowHandles();
		for(String windows:childString)
		{
			
			driver.switchTo().window(windows);
			if(driver.getTitle().contains("Olive Garden Italian Restaurant"))
			{
				System.out.println("oloiver garden deleted");
				driver.close();
				

			    
			}
	//	System.out.println(driver.getTitle());
			Thread.sleep(1000);
		}
	}

}
