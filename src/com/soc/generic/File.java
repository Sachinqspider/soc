package com.soc.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File {
	public  String getPropertyData(String key)  throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties P = new Properties();
		P.load(fis);
		String data = P.getProperty(key);
		return data;

	}
	
	public  String getExcellyData(String sheetName,int row,int cell)  throws IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
		
	}
}
