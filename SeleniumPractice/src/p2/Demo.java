package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import p1.Webdriver;

public class Demo {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).isDisplayed());
		
		
		//enable
		
	System.out.println(driver.findElement(By.xpath("(//input[@id='small-searchterms'])")).isEnabled());
	
	
	
	
	//selected
	driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected());
	//getAttrsibute	
	
		
		
		
	System.out.println(driver.findElement(By.xpath("//a[@class='ico-register']")).getText());
	System.out.println(driver.findElement(By.xpath("//a[@class='ico-register']")).getAttribute("href"));	
		
		
		System.out.println(driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).getCssValue("color"));
		
		
		
		
	System.out.println(	driver.findElement(By.xpath("(//input[@id='small-searchterms'])")).getAttribute("value"));
	driver.findElement(By.xpath("(//input[@id='small-searchterms'])")).sendKeys("books");
	System.out.println(	driver.findElement(By.xpath("(//input[@id='small-searchterms'])")).getAttribute("value"));
	
	}

}
