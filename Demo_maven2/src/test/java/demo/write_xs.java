package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class write_xs {
  @Test
  public void write_xls() throws IOException {
	  File src = new File("C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\demo.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook work=new XSSFWorkbook(fis);
	  XSSFSheet sh=work.getSheetAt(0);
	  
	  int rowCount= sh.getLastRowNum();
	  System.out.println("Total no of rows is: "+rowCount);
	  
	  for(int i=1;i<=rowCount;i++)
	  {
		  String Firstname=sh.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("FirstName is: "+Firstname);
		  
		  String lastname=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("User is: "+lastname);
		  
		  String password=sh.getRow(i).getCell(2).getStringCellValue();
		  System.out.println("Password is: "+password);
		  
		  String Cpass=sh.getRow(i).getCell(3).getStringCellValue();
		  System.out.println("Confrim pwd is: "+Cpass);
	  }
	  work.close();
	  
  }
}
