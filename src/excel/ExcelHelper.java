package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper<K, V> {
		 XSSFSheet st;
		public ExcelHelper() throws Exception {
			
			File f=new File(System.getProperty("user.dir")+"\\Book1.xlsx");
			FileInputStream fis =new FileInputStream(f);
			
		XSSFWorkbook wb = new	XSSFWorkbook(fis);
	    XSSFSheet st = wb.getSheet("hello");		
	int lrn = st.getLastRowNum();
			
		}
		public ArrayList<String> getKeyValueFromList() {
			ArrayList<String>keys=new ArrayList();
			for(int i=1;i<=st.getLastRowNum();i++) {
				
				XSSFRow rw = st.getRow(i);
				XSSFCell cel = rw.getCell(0);
			CellType celty = cel.getCellType();
	 String key = getKeyValueAccToCellType(cel);
	 keys.add(key);
	 
			}
			return keys;
			}	
		public ArrayList<String> getValuesFromRequiredColumn(int columnIndex)
		{
			ArrayList<String> keys = new ArrayList<>();
			for (int i = 1; i <= st.getLastRowNum(); i++) {
				XSSFRow row = st.getRow(i);
				XSSFCell cel = row.getCell(columnIndex);
				String kk = getKeyValueAccToCellType(cel);
				keys.add(kk);
			}
			return keys;
		}
			public ArrayList<String> getValueFromList() {
				ArrayList<String> values=new ArrayList();
				for(int i=1;i<=st.getLastRowNum();i++) {

					XSSFRow rw = st.getRow(i);
					XSSFCell cel = rw.getCell(1);
				CellType celty = cel.getCellType();
				String value = getKeyValueAccToCellType(cel);
				values.add(value);
				}
				return values;
					
			}
			
			public HashMap<String,String> getKeyValuePairFromList(){
				
				HashMap<String,String>data=new HashMap<>();
				
				for(int i=1;i<=st.getLastRowNum();i++) {
					
					XSSFRow rw = st.getRow(i);
					XSSFCell cel = rw.getCell(0);
				String k=	getKeyValueAccToCellType(cel);
				cel=	rw.getCell(1);
					String v=getKeyValueAccToCellType(cel);
					
					data.put(k,v);
				}
					return data;
			}
		
			
			public static String getKeyValueAccToCellType(XSSFCell cel) {
				Object data = 0;
				switch ( cel.getCellType()) {

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
			}
			
			return data.toString();
			
		}
		
	}

