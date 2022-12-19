package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader6 {
public static void main(String[] args) throws Exception {
		
		
		File f=new File(System.getProperty("user.dir")+"\\Book1.xlsx");
		FileInputStream fis =new FileInputStream(f);
		
	XSSFWorkbook wb = new	XSSFWorkbook(fis);
    XSSFSheet st = wb.getSheet("hello");		
int lrn = st.getLastRowNum();
ArrayList<String>keys=new ArrayList();
ArrayList<String>values =new ArrayList();

 for(int i=1;i<=lrn;i++) {
	 
	XSSFRow rw = st.getRow(i);
	XSSFCell cel = rw.getCell(0);
	CellType celty = cel.getCellType();
	String key = getValuefromExcelSheet(cel);
	
	keys.add(key);
	 
 }
for(int i=1;i<=lrn;i++) {
	
	XSSFRow rw = st.getRow(i);
	XSSFCell cel = rw.getCell(1);
	CellType celty = cel.getCellType();
	String value = getValuefromExcelSheet(cel);
	
	values.add(value);
}

	System.out.println(keys);	
		System.out.println(values);

	}
	public static String getValuefromExcelSheet(XSSFCell cel) {
		Object data=0;
		switch (cel.getCellType()) {
		
		case STRING:
			data=(cel.getStringCellValue());
			break;
		case BOOLEAN:
			data=(cel.getBooleanCellValue());
			break;
		case FORMULA:
			data=(cel.getBooleanCellValue());
		break;	
		case NUMERIC:
			data=(cel.getNumericCellValue());
		break;
		}
		
		return data.toString();
		
		
	}

}
