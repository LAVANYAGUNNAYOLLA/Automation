package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet {
	public static void main(String[] args) throws IOException {
		FileInputStream fise=new FileInputStream("C:\\Users\\Lavan\\Downloads\\TestData1.xlsx");
		Workbook wb=WorkbookFactory.create(fise);
		boolean data=wb.getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(data);
		
		
		
	}

}
