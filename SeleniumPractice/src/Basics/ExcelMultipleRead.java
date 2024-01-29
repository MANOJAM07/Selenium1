package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultipleRead {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./Data/ExcelTest.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet=workbook.getSheet("login");
		int rowsize=sheet.getPhysicalNumberOfRows();
		int column=sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
			}
			System.out.println();
		}

	}

}
