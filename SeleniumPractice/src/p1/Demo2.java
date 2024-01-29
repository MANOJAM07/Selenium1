package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manoj/Downloads/xpath.html");
		driver.findElement(By.xpath("(//input)[1]/following-sibling::input/following-sibling::button/preceding-sibling::input[1]")).sendKeys("ram");
	}

}
