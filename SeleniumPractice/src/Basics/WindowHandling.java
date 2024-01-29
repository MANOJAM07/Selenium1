package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manoj/Documents/SeleniumFolder/MultipleWindow%20(1).html");
	String parent=	driver.getWindowHandle();
	
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
	Thread.sleep(3000);
Set<String> windows = driver.getWindowHandles();

for(String wi:windows)
{
	Thread.sleep(3000);
	driver.switchTo().window(wi);
	if(driver.getCurrentUrl().contains("barbeque"))
	{
		driver.close();
	}
	else {
		System.out.println(driver.getCurrentUrl());
	}
}
	}

}
