package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreadingex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        File myfile = new File("G:\\book1.xlsx");
		
		Sheet book = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int lastrow = book.getLastRowNum();
		int totalrownum = lastrow;
		
		short lastcolumn = book.getRow(0).getLastCellNum();
		int totalcolumn = lastcolumn-1;
		
		System.out.println(totalrownum);
		System.out.println(totalcolumn);
		
		
		for(int i=0;i<=totalrownum;i++) 
		{
			for(int j=0;j<=totalcolumn;j++) 
			{
				String value1 = book.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1+ " |");
			}
			System.out.println();
		}

	}

}
