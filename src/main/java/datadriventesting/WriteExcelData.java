package datadriventesting;

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file=new FileOutputStream("E:\\MindQ\\Automation\\seleniumpractice\\testdata\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet2");

		
		for (int i = 0; i <= 15; i++) {
			XSSFRow row = sheet.createRow(i);

			for (int j = 0; j < 13; j++) {
				row.createCell(j).setCellValue("Harsha Reddy");
			}
		}
		wb.write(file);
		System.out.println("writing excel is completed");

	}

}
