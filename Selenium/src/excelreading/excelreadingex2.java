package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelreadingex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("G:\\book1.xlsx");
		
		Workbook book = WorkbookFactory.create(myfile);
	    Sheet excelsheet = book.getSheet("Sheet1");
		Row row = excelsheet.getRow(1);
		Cell cell = row.getCell(0);
		CellType celltype1 = cell.getCellType();
		String value = cell.getStringCellValue();
		System.out.println(value);
		short totalcolumn = row.getLastCellNum();
		int noofrows = excelsheet.getLastRowNum();
		
		for(int i=0;i<=4;i++) // static coding
		{
		   String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		   System.out.println(value1);
		}
		System.out.println("============================");
		for(int i=0;i<=noofrows;i++) //print single column using dynamic coding technique
		{
			String Firstcolumn = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(Firstcolumn);
		}
		System.out.println("============================");
		for(int i=0;i<=totalcolumn-1;i++) //Print single row using dynamic coding technique
		{
			String firstrow = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(i).getStringCellValue();
			System.out.print(firstrow+"  ");
		}
		
		
		
		
	}

}
