package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEx4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("G:\\book1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		int Totalrows = mysheet.getLastRowNum();
	    int totalcolumn = mysheet.getRow(Totalrows).getLastCellNum()-1;
	    
	    for(int i=0;i<=Totalrows;i++) {
	    	for(int j=0;j<=totalcolumn;j++) {
	    
	        	Cell cell = mysheet.getRow(i).getCell(j);
		
		CellType celltype = cell.getCellType();
		if(celltype==CellType.STRING) 
		{
			System.out.print(cell.getStringCellValue()+"  ");
		}
		
		if(celltype==CellType.NUMERIC) 
		{
			System.out.print(cell.getNumericCellValue()+"  ");
		}
		
		if(celltype==CellType.BOOLEAN) 
		{
			System.out.print(cell.getBooleanCellValue()+"  ");
		}
		if(celltype==CellType.BLANK) 
		{
			System.out.print("  ");
		}
		
	    }
	    	System.out.println();
	    }
			
		
		
	}

}
