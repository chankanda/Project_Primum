package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	private static void write_AllData() throws IOException {
		File f = new File("C:\\Users\\chank\\eclipse-workspace\\MavenProject\\Excel\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("PersonalData1").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("PersonalData1").getRow(0).createCell(1).setCellValue("Education");
		wb.getSheet("PersonalData1").createRow(1).createCell(0).setCellValue("Dinesh");
		wb.getSheet("PersonalData1").getRow(1).createCell(1).setCellValue("B.Com.,");
		wb.getSheet("PersonalData1").createRow(2).createCell(0).setCellValue("Prakash");
		wb.getSheet("PersonalData1").getRow(2).createCell(1).setCellValue("M.B.A.,");
		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
		System.out.println("Write Successfully");
	}

	public static void main(String[] args) throws IOException {
		write_AllData();

	}
}
