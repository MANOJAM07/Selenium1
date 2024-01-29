package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manoj/Downloads/demo.html");
	WebElement element=	driver.findElement(By.xpath("//select[@id='standard_cars']"));
	Select select=new Select(element);
	List<WebElement>e=select.getOptions();
	select.selectByIndex(1);
	for(int i=0;i<e.size();i++)
	{
	 select.selectByIndex(i);
	 Thread.sleep(1000);
	 System.out.println(e.get(i).getText());

	}
	System.err.println(select.isMultiple());
	
	element=driver.findElement(By.xpath("//select[@id='multiple_cars']"));
	select=new Select(element);
	e=select.getOptions();
	for(int i=0;i<e.size();i++)
	{
	 select.selectByIndex(i);
	 Thread.sleep(1000);
	 System.out.println(e.get(i).getText());

	}
	System.err.println(select.isMultiple());
	
	select.deselectAll();
	
	
	
	
	}

}
