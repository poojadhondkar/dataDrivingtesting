package testingPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	 //File  file;
	  FileInputStream fis;
	  XSSFWorkbook wb;
	  XSSFSheet sheet;
	  
	  File  file =new File("C:\\Users\\Anas PC\\eclipse-workspace\\DataDrivenTesting\\src\\main\\java\\testingPages\\data.xlsx");
	  
	  public String readExcellData (int sheetN, int row, int cell) throws IOException {
			
			//file = new File(file);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheetN);
			 XSSFCell cell1 = sheet.getRow(row).getCell(cell);
			 String data ="";
			 
			 switch(cell1.getCellType()) {
			 
			 case STRING :data = (cell1.getStringCellValue()+"     ");break;
			 case NUMERIC :data = (cell1.getNumericCellValue()+"    ");break;
			 case BOOLEAN :data = (cell1.getBooleanCellValue()+"    ");break;
			default:
				break;
			
			 }
			
			return data;
	  }
			public int lastRowN (int sheetN) throws IOException {
				//file = new File (path);
				fis = new FileInputStream (file);
				wb = new XSSFWorkbook (fis);
				sheet = wb.getSheetAt(sheetN);
				
				int lastrownum = sheet.getLastRowNum();
				return lastrownum;
			}
			
			public int lastCellN (int sheetN, int row) throws IOException {
				//file = new File (path);
				fis = new FileInputStream (file);
				wb = new XSSFWorkbook (fis);
			    sheet = wb.getSheetAt(sheetN);
				
				int lastcellnum =sheet.getRow(row).getLastCellNum();
				return lastcellnum;
}
}