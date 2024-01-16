package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String s = ExcelCode.readStringData(0,2);
		
		System.out.println(s);
		
		double p = ExcelCode.readIntegerData(2,1);
		
		System.out.println(p);
		

	}

}
