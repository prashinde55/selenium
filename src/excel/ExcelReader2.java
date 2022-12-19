package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

public static void main(String[] args) throws Exception {
		
		File f=new File(System.getProperty("user.dir")+"\\chromedriver_win32\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb = new	XSSFWorkbook(fis);
		
    XSSFSheet st = wb.getSheet("hello");
    int LastRw = st.getLastRowNum();
    System.out.println (LastRw);
    int LastRw1 = st.getPhysicalNumberOfRows();
    System.out.println(LastRw1);
   
    for(int i=1;i<=LastRw;i++) {
    	
    	XSSFRow rw = st.getRow(i);
    XSSFCell cel = rw.getCell(0);
    System.out.println(cel.getStringCellValue());
    	
    }
for(int i=1;i<=LastRw;i++) {
	
	XSSFRow rw = st.getRow(i);
	XSSFCell cel = rw.getCell(1);
	System.out.println(cel.getStringCellValue());
	// it will show error from Pune onwords becz it Take Cell value as String Only 
	// so Get Vlaue According to Cell Type
}


	}



}
