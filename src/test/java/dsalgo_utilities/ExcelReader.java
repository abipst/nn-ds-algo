package dsalgo_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	//public static int numberOfRows;

	public List<Map<String, String>> getData(String sheetName){

		//String path = System.getProperty("user.dir")+"/src/test/resources/test_data/TestData.xlsx";
		
		ConfigReader config =  new ConfigReader();
		
		String path = config.getExcelpath();
	
		File Excelfile = new File(path);
		
		FileInputStream Fis = null;
		
		try {
			
			Fis = new FileInputStream(Excelfile);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		XSSFWorkbook workbook = null;
		
		try {
			workbook = new XSSFWorkbook(Fis);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		try {
			workbook.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return readSheet(sheet);
		
	}


	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		Cell cell;

		int numberOfRows = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {

			row = sheet.getRow(currentRow);

			int numberOfColumns = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

				for (int currentColumn = 0; currentColumn < numberOfColumns; currentColumn++) {

						cell = row.getCell(currentColumn);

						String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();

						columnMapdata.put(columnHeaderName, cell.getStringCellValue());
				}

				excelRows.add(columnMapdata); 
				
		}

		return excelRows;
	}
			
	}

	


