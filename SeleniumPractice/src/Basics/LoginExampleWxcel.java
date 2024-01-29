package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginExampleWxcel {
	@Test(dataProvider = "test")
	public void login(String userName, String password) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys(userName);
		driver.findElement(By.className("password")).sendKeys(password);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
//		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
//	

	}

	@DataProvider(name = "test")
	public Object[][] testData() throws EncryptedDocumentException, IOException {
		File file=new File("./Data/ExcelTest.xlsx");
		FileInputStream fs=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fs);
		Sheet sheet=workbook.getSheet("login");
		Row row=sheet.getRow(0);
	 org.apache.poi.ss.usermodel.Cell cell=row.getCell(0);
	 
	 int rowsize=sheet.getPhysicalNumberOfRows();
	 int colum_size=row.getPhysicalNumberOfCells();
	 String [][] value=new String[rowsize-1][colum_size];
	 
	 for(int i=0;i<rowsize-1;i++)
	 {
		 for(int j=0;j<colum_size;j++ )
		 {
			 value[i][j]=sheet.getRow(i+1).getCell(j).toString();
		 }
	 }
	 
	 for(int i=0;i<rowsize-1;i++)
	 {
		 for(int j=0;j<colum_size;j++ )
		 {
		System.out.println(value[i][j]);
		 }
	 }
	 
	 return value;
	 
	


}
}