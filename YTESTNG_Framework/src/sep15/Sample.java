package sep15;
	import java.io.FileInputStream;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class Sample {
		public static void main(String[] args) throws Throwable {
			FileInputStream fi = new FileInputStream("D:\\Sample_1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet ws = wb.getSheet("EMP");
			XSSFRow row = ws.getRow(0);
			int rc = ws.getLastRowNum();
			int cc = row.getLastCellNum();
			System.out.println("No.of rows are::"+rc+"   "+"No.of cells in first row::"+cc);
	fi.close();
	wb.close();
		}
	}



