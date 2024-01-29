package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select03 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	WebElement element=	driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Select select=new Select(element);
	List<WebElement>list=select.getOptions();
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
	}
	}

}
