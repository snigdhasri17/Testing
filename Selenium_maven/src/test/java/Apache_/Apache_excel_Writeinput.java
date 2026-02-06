package Apache_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_excel_Writeinput {
	public static void main(String[] args)throws IOException {
		
		//String pjtpath = System.getProperty("2user.dir") (these two lines other way to open excel file.))
		//FileInputStream fis = new FileInputStream(pjtpath + "/excel/Excel Ass.xlsx");
		FileInputStream fis = new FileInputStream("/home/labuser/Documents/Excel Ass.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		sheet.getRow(8).createCell(1).setCellValue("Fail");
		
		FileOutputStream fout = new FileOutputStream("/home/labuser/Documents/Excel Ass.xlsx");
		wb.write(fout);
		wb.close();
	}

}
