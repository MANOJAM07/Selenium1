package MultiWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manoj/Downloads/MultipleWindow.html");
		String parentString=driver.getWindowHandle();
		System.err.println(parentString);
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		
		Set<String>childSet=driver.getWindowHandles();
		System.out.println(childSet);
		
		
		for(String window:childSet)
		{
			driver.switchTo().window(window);
			if(!(driver.getTitle().equalsIgnoreCase("Multiple popups")))
			{
				driver.close();
			}
			
		}
		
		
		
		}

}
