package test_Excel;

import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Excel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("E:\\Java By Kiran\\Info.xls");

		Workbook work = Workbook.getWorkbook(file);

		Sheet sheet = work.getSheet(0);

		int row = sheet.getRows();

		int coloum = sheet.getColumns();

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < coloum; j++) {

				// Cell cell = sheet.getCell(coloum, row);

				Cell cell = sheet.getCell(j, i);

				String str = cell.getContents();

				System.out.println(str);

			}

			System.out.println("---------------");
		}

	}

}
