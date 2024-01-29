package Basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.navigate().back();
//	driver.navigate().refresh();	
	
	
		driver.navigate().forward();
		driver.navigate().to(new URL("https://www.selenium.dev/downloads/"));
	}

}
