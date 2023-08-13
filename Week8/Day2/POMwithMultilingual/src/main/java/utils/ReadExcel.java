package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcelData(String excelFileName,String sheetName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelFileName+".xlsx");//./data/CreateLead.xlsx
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println("The total number of rows: "+rowCount);
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The total number of columns: "+columnCount);
		System.out.println("Entire data :----------------------");
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = eachRow.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;//0,0 
			}

		}

		wb.close();
		return data;

	}

}
