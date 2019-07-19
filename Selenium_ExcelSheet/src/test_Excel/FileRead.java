package test_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("pxyz.txt");

		int a = 0;

		while ((a = fis.read()) != -1) {

			fos.write(a);

			char ch = (char) a;

			System.out.print(ch);
		}
	}

}
