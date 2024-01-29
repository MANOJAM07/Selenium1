
package MultiWindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHand {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("file:///C:/Users/Manoj/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		Set<String> childString=driver.getWindowHandles();
		for(String windows:childString)
		{
			if(windows.contains("Original Italian Recipes - Giallozafferano Recipes")) {
			driver.switchTo().window(windows);
			
			System.out.println(driver.getTitle());
			//Thread.sleep(1000);
			break;
			}
		}
	}


}
