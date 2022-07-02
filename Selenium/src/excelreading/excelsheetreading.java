package excelreading;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheetreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("G:\\book1.xlsx");
		String column = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.print(column+" | ");
        
        String column1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.print(column1+" | ");
        
        String column2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
        System.out.print(column2+" | ");
        
        String column3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
        System.out.print(column3+" | ");
        
       
       
        System.out.println();
       
		String A2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.print(A2+" | ");
        
        String B2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.print(B2+" | ");
        
        String C2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        System.out.print(C2+" | ");
        
        String D2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
        System.out.print(D2+" | ");
        
       
        
        System.out.println("========================");
        for(int i=0;i<=3;i++) 
        {
        	
        	String loop = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(i).getStringCellValue();
        	System.out.print(loop+" | ");
        	
        
        }
        System.out.println();
        for(int i=0;i<=2;i++) 
        {
        	
        	String loop = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(i).getStringCellValue();
        	System.out.print(loop+" | ");
        	
        
        }
        System.out.println();
        for(int i=0;i<=2;i++) 
        {
        	
        	String loop = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(i).getStringCellValue();
        	System.out.print(loop+" | ");
        }

	}

}
