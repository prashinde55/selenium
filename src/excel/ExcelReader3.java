package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {

public static void main(String[] args) throws Exception {
		
		File f=new File(System.getProperty("user.dir")+"\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet st = wb.getSheet("hello");
	int lrn = st.getLastRowNum();
	
		for(int i=1;i<=lrn;i++) {
XSSFRow rw = st.getRow(i);
			
XSSFCell cel = rw.getCell(0);
CellType celty = cel.getCellType();
switch (celty) {
case STRING:
	System.out.println(cel.getStringCellValue());
	break;
case BOOLEAN:
	System.out.println(cel.getBooleanCellValue());
break;
case NUMERIC:
	System.out.println(cel.getNumericCellValue());
	break;
case FORMULA:
	System.out.println(cel.getCellFormula());
	break;
	
	default:
	System.out.println("can not decide cell type ");
	break;
}
		}
		for(int i=1;i<=lrn;i++) {
			
			XSSFRow rw = st.getRow(i);
			
			XSSFCell cel = rw.getCell(1);
			CellType celty = cel.getCellType();
		
			switch (celty) {
			case STRING:
				System.out.println(cel.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(cel.getBooleanCellValue());
			break;
			case NUMERIC:
				System.out.println(cel.getNumericCellValue());
				break;
			case FORMULA:
				System.out.println(cel.getCellFormula());
				break;
				
				default:
				System.out.println("can not decide cell type ");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
