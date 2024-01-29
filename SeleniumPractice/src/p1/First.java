package p1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		WebDriver driver=new ChromeDriver();
		for(int i=0;i<=4;i++)
		{
			System.out.println("enter firstName :");
			String string=s.next();
			System.out.println("enter lastName: ");
			String string2=s.next();
			System.out.println("enter email :");
			String string3=s.next();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("book");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
      //  driver.close();
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(string);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(string2);
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string3);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("manooj");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("manooj");
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
		}
	}

}
