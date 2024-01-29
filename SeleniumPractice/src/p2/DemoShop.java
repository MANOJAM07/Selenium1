package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class DemoShop 
{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Jewelry");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='As']")).click();
		driver.findElement(By.xpath("//option[@value='12']")).click();
		
		//driver.findElement(By.xpath("//label[text()='Manufacturer:']/parent::div/child::select/option[2]")).click();
		driver.findElement(By.xpath("//input[@name='Pf']")).sendKeys("100.00");
		driver.findElement(By.xpath("//input[@name='Pt']")).sendKeys("250.00");
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).click();
		
	}
}
