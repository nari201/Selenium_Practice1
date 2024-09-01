package dataDriven_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Excel_data_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 FileInputStream file = new FileInputStream ("D://Selenium_Files//Selenium_Notes//Excel1.xlsx");
		 
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
		  
		 XSSFSheet sheet = workbook.getSheet("Sheet1"); // Name of sheet
		  
		//  XSSFSheet sheet = workbook.getSheetAt(0); // Index of sheet
		  
	    int rowcount = sheet.getLastRowNum();
	    
		  
		int cellcount =  sheet.getRow(0).getLastCellNum();

		
		 for (int i =0 ; i< rowcount; i++) {
			 
			 XSSFRow currentrow = sheet.getRow(i); // current row
			 
			 for (int j = 0; j< cellcount ; j++ ) {
				 
				String value= currentrow.getCell(j).toString();  // Read value from cell
				

			//	String value= currentrow.getCell(j).getStringCellValue(); 
					
				System.out.print( "  "+value+"  ");
				 
			 }
			 System.out.println();
			 
		 }
		  
	}

}
