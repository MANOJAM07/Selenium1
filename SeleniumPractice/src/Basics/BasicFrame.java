package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Manoj/Downloads/iframe%20(1).html");
		driver.switchTo().frame("FR1");
		driver.findElement(By.linkText("LATEST")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Google")).click();
	}

}
