package demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class xs {
  @Test
  public void xls() throws IOException {
	XSSFWorkbook workbook = new XSSFWorkbook();
	FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\demo.xlsx"));
	workbook.write(out);
	out.close();
	System.out.println("demo.xlsx created successfully");
	  workbook.close();
  }

}
