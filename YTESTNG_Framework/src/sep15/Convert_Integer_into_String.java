package sep15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import bsh.org.objectweb.asm.Type;

public class Convert_Integer_into_String {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EMP");
		int rc = ws.getLastRowNum();
	for (int i=1; i<=rc; i++)
	{
	if (wb.getSheet("EMP").getRow(i).getCell(3).getCellType()==CellType.NUMERIC)	
	{
		int celldata = (int)wb.getSheet("EMP").getRow(i).getCell(3).getNumericCellValue();
		String eid = String.valueOf(celldata);
		System.out.println(eid);
	}
	}
fi.close();
FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
wb.write(fo);
fo.close();
wb.close();
}
}