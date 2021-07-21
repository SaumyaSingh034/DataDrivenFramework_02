package dataDrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDFramework1 {

	public static void main(String[] args) throws IOException {
		
		File fi = new File("D:\\Selenium\\RealTimeProjects\\DataDrivernFramework\\testData\\testData.xlsx");
		FileInputStream fis= new FileInputStream(fi);
		
		//Creating workbook instance that refers to .xlsx file
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = wb.getSheetAt(i);
				XSSFRow row = sheet.getRow(1);
				XSSFCell cell = row.getCell(2);
				String address = cell.getStringCellValue();
				System.out.println(address);
			}
		}
		
	}

}
