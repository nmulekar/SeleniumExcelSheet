package test_Excel;

import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("E:\\Java By Kiran\\Info.xls");
		
		Workbook work = Workbook.getWorkbook(file);
		
		Sheet sheet = work.getSheet(0);
		
		int row = sheet.getRows();
		
		int coloum = sheet.getColumns();
		
		Cell cell = sheet.getCell(1, 3);
		
		String str = cell.getContents();
		
		System.out.println(str);

	}

}
