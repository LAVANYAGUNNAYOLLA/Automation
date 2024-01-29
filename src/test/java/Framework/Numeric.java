package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numeric {
	public static void main(String[] args) throws Throwable {
		FileInputStream fise=new FileInputStream("C:\\Users\\Lavan\\Downloads\\TestData2.xlsx");
		Workbook wb=WorkbookFactory.create(fise);
		double data=wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data);
		
		
	}

}
