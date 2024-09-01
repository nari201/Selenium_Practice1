package dataDriven_Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream ("D://Selenium_Files//Selenium_Notes//Excel1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook ();
		
		XSSFSheet sheet1 = workbook.createSheet("data");
		
		for (int i = 0; i<= 9; i ++) {
			
			XSSFRow row = sheet1.createRow(i);
			
			for (int k = 0; k< 3 ; k++) {
				
				row.createCell( k).setCellValue("N@resh");
			}
			
			
		}
		
		workbook.write(file);
		
		file.close();
		
			System.out.println("Excel Write completed");
	}	

}
