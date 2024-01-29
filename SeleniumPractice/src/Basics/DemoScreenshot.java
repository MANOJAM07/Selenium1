package Basics;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FrameworkComponent.UtilityMethods;

public class DemoScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File dest=new File("./Screenshots/Homepage.png");
//	File file=	ts.getScreenshotAs(OutputType.FILE);
//org.openqa.selenium.io.FileHandler.copy(file, dest);	
		driver.findElement(By.className("ico-login")).click();
		UtilityMethods.takeScreenshot(driver, /*new File("./Screenshots/login.png")*/"login");
	}

}
