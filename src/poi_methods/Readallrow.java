package poi_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readallrow {

		public static void main(String[] args) throws Throwable {
			FileInputStream fi=new FileInputStream("E:/Book1.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet ws=wb.getSheet("EMPDATA");
			int rc=ws.getLastRowNum();
			for(int i=1;i<=rc;i++)
			{
			String fname=ws.getRow(i).getCell(0).getStringCellValue();
			String mname=ws.getRow(i).getCell(1).getStringCellValue();
			String lname=ws.getRow(i).getCell(2).getStringCellValue();
			ws.getRow(i).createCell(3).setCellValue("I will DO IT");
			System.out.println(fname+" "+mname+" "+lname);
			}
			fi.close();
			FileOutputStream fo=new FileOutputStream("E:/addingResultRow2.xlsx");
			wb.write(fo);
			fo.close();
			wb.close();
			

	}

}
