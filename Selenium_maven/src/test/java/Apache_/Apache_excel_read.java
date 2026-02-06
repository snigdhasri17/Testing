package Apache_;

import java.io.IOException;

//import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_excel_read {
public static void main(String[] args) throws IOException{
	//String prjpath = System.getProperty("user.dir");
	
	XSSFWorkbook workbook = new XSSFWorkbook("/home/labuser/Documents/Excel Ass.xlsx");
	XSSFSheet sheet = workbook.getSheet("sheet1");
	int x= sheet.getPhysicalNumberOfRows();
	System.out.println(x);
	System.out.println(sheet.getRow(1).getCell(1).getRawValue());//getStringCellValue()//getColumnIndex()
}
}
