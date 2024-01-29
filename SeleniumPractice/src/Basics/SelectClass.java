package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import FrameworkComponent.UtilityMethods;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");

		WebElement sorting = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		//UtilityMethods u=new UtilityMethods();
		
		UtilityMethods.selectOptions(sorting, "3");

	}

}
