package test_Excel;

import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReadXLS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("abcd.xls");

		Workbook wk = Workbook.getWorkbook(fis);

		Sheet sheet = wk.getSheet(1);

		int row = sheet.getRows();

		int cols = sheet.getColumns();

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < cols; j++) {

				Cell cell = sheet.getCell(j, i);

				System.out.println(cell.getContents());

			}
			
			System.out.println("---------------------------");
		}

	}

}
	