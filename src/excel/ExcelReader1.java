package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {
public static void main(String[] args) throws Exception {
		
		File f=new File(System.getProperty("user.dir")+"\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet st=	wb.getSheet("hello");
           XSSFRow rw = st.getRow(2);		

         XSSFCell cel = rw.getCell(0);
         
    String celval = cel.getStringCellValue();     
    System.out.println(celval);
    

	}

}
