package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelSingleRead {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("./Data/ExcelTest.xlsx");
		FileInputStream fis=new FileInputStream(file);
//		Workbook workbook=WorkbookFactory.create(fis);
//		Sheet sheet=(Sheet) workbook.getSheet("login");
//		
//		
//		Sheet sheet= workbook.getSheet("login");
		Workbook workbook=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet=workbook.getSheet("login");
		Row row=sheet.getRow(1);
org.apache.poi.ss.usermodel.Cell cell=row.getCell(0);

System.out.println(cell.toString());



	}

}
