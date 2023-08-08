package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		FileInputStream ip = new FileInputStream("E:\\MindQ\\Automation\\seleniumpractice\\testdata\\Data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet = wb.getSheet("Sheet2");

		int rownum = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rownum; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < colcount; j++) {
				String Value = row.getCell(j).toString();
				System.out.println(Value + " ");
				//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
			}
			System.out.println();
		}

	}

}
