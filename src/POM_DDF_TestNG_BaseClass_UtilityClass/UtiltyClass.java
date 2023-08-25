package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtiltyClass 
{
	
	//@Author Name: Sanjay
	//Date: 25th Aug 23
	//this method is use to get test data from excel sheet
	//need to pass  2 inputs
	public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Daily Examples\\Revision Session2\\SeleniumRevision2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}

}
