package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SS_DataUtility {

	public String dataFromPropertiesFile(String key) throws IOException
	{
		File file=new File(SS_IPathConstant.propertiesPath);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

	public String dataFromExcelFile(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		//Fetching data from excel
		File file=new File(SS_IPathConstant.excelPath);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(rowNum);
		DataFormatter formatter=new DataFormatter();
		String value=formatter.formatCellValue(cell);
		return value;
	}

}
