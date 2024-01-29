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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkComponent.BaseTest;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class DataDriveExcel extends BaseTest{
	@DataProvider(name = "data")
	public String[][] getDataExcel() throws EncryptedDocumentException, IOException
	{
		return getExcelData();
	}

	
	public String[][] getExcelData() throws EncryptedDocumentException, IOException
	{
		File file=new File("./Data/ExcelTest.xlsx");
		FileInputStream fs=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fs);
		Sheet sheet=workbook.getSheet("login");
		Row row=sheet.getRow(0);
	 org.apache.poi.ss.usermodel.Cell cell=row.getCell(0);
	 
	 int rowsize=sheet.getPhysicalNumberOfRows();
	 int colum_size=row.getPhysicalNumberOfCells();
	 String [][] value=new String[rowsize][colum_size];
	 
	 for(int i=1;i<rowsize;i++)
	 {
		 for(int j=0;j<colum_size;j++ )
		 {
			 value[i][j]=sheet.getRow(i).getCell(j).toString();
		 }
	 }
	 
	 return value;
	 
	 
	 
		
	}
	
	@Test(dataProvider ="data")
	public void executeLogin(String userName,String password)
	{
		HomePage homePage=new HomePage(driver);
		homePage.clickLogin();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(userName);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}
	

}
