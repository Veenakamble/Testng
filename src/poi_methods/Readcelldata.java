package poi_methods;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readcelldata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("E:/Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		XSSFRow row=ws.getRow(5);
		XSSFCell c1=row.getCell(0);
		XSSFCell c2=row.getCell(1);
		XSSFCell c3=row.getCell(2);
		String fname=c1.getStringCellValue();
		String mname=c2.getStringCellValue();
		String lname=c3.getStringCellValue();
		System.out.println(fname+"  "+mname+"  "+lname);
		fi.close();
		wb.close();
		
		

	}

}
