package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	public static FileInputStream f ;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String readStringData(int i, int j) throws 
IOException
	{
		f = new FileInputStream("C:\\Users\\harikrishnan\\Desktop\\Test mAven.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static double readIntegerData(int i, int j) throws 
IOException
	{
		f = new FileInputStream("C:\\Users\\harikrishnan\\Desktop\\Test mAven.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getNumericCellValue();
	}
	
}



/*FileInputStream - for fetching the file from system - predefined class
XSSFWorkbook - for fetching the workbook from system - predefined
XSSFSheet - for fetching the exact sheet to get the data from system*/