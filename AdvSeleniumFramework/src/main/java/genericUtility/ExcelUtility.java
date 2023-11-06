package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.internal.reflect.Parameter;

public class ExcelUtility implements IAutoConstants {
	@DataProvider(name="data")
	public Object[][] readExcelFile() {
		
		Workbook workbook=null;
		File file=new File(Excel_File_Path);
		try {
			 workbook=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowCount][cellCount];
		
		for(int row=0;row<rowCount;row++) {
			Row actRow = sheet.getRow(row);
			int actCell = actRow.getPhysicalNumberOfCells();
			
			for(int cell=0;cell<actCell;cell++)
			{
				data[row][cell]=actRow.getCell(cell).toString();
			}
			
		}
		return data;
	}

}
