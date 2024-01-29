package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkComponent.BaseTest;

public class ExcelDataProvider extends BaseTest{
	
	public static String[][] getData() throws EncryptedDocumentException, IOException {
		File file = new File("./Data/ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("login");
		int rowsize = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] a = new String[rowsize][column];
		for (int i = 1; i < rowsize; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sheet.getRow(i).getCell(j).toString();
			}

		}
		return a;

}
	
@DataProvider(name="excel",parallel = true)
	public String[][] dataValue() throws EncryptedDocumentException, IOException
	{
	return	ExcelDataProvider.getData();
	}

@Test(dataProvider ="excel")
public void login(String userName,String password)
{
//	WebDriver driver = new ChromeDriver();
//
//	driver.get("https://demowebshop.tricentis.com");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.className("email")).sendKeys(userName);
	driver.findElement(By.className("password")).sendKeys(password);
	driver.findElement(By.cssSelector(".button-1.login-button")).click();

	
}



	
	
}