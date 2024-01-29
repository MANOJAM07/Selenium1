package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkComponent.BaseTest;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.Register;

public class RegisterPage extends BaseTest{
	@DataProvider(name = "data")
	public String[][] getDataExcel() throws EncryptedDocumentException, IOException
	{
		return getExcelData();
	}

	
	public String[][] getExcelData() throws EncryptedDocumentException, IOException
	{
		File file=new File("./Data/RegisterPage (1).xlsx");
		FileInputStream fs=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fs);
		Sheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.getRow(0);
	 org.apache.poi.ss.usermodel.Cell cell=row.getCell(0);
	 
	 int rowsize=sheet.getPhysicalNumberOfRows();
	 int colum_size=row.getPhysicalNumberOfCells();
	 String [][] value=new String[rowsize][colum_size];
	 
	 for(int i=0;i<rowsize-1;i++)
	 {
		 for(int j=0;j<colum_size;j++ )
		 {
			 value[i][j]=sheet.getRow(i+1).getCell(j).toString();
		 }
	 }
	 
	 return value;
	 
	 
	 
		
	}
	
	@Test(dataProvider ="data")
	public void executeLogin(Character gender,String  fisrtName,String lastname,String email,  String password,String confrmp)
	{
		HomePage homePage=new HomePage(driver);
		homePage.clickRegister();
		Register r=new Register(driver);
		if(gender=='m'||gender=='M')
		{
		r.genderMale();
		}
		else {
			r.genderFeMale();
		}
		r.enterFirstname(fisrtName);
		r.enterLastname(lastname);
		r.enterEmail(email);
		r.enterPassword(password);
        r.enterCOnfirmPwd(confrmp);
        r.submit();
        driver.navigate().back();
	}
	


}
