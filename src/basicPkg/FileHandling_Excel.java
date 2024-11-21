package basicPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandling_Excel 
{

	public static void readexcelfile() throws Exception
	{
		
		File f = new File("./TestData/test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("data");
		
		int r = sh1.getPhysicalNumberOfRows();
		System.out.println(r); //3  //0<3, 1<3, 2<3)
		
		for(int i=0; i<r; i++)  //0<3, 1<3, 2<3
		{
			XSSFRow row = sh1.getRow(i); //i=0
			
			int c = row.getPhysicalNumberOfCells();
			//System.out.println(c);
			
			for(int j=0; j<c; j++)
			{
				XSSFCell col = row.getCell(j);
				System.out.print(col.getStringCellValue() + "    ");
				
			}
			
			System.out.println();
			
		}
		
		
		
		/*
		//Row1
		XSSFRow row1 = sh1.getRow(0);
		XSSFCell col11 = row1.getCell(0);
		XSSFCell col12 = row1.getCell(1);
		System.out.println(col11.getStringCellValue());
		System.out.println(col12.getStringCellValue());
		
		//Row2
				XSSFRow row2 = sh1.getRow(1);
				XSSFCell col21 = row2.getCell(0);
				XSSFCell col22 = row2.getCell(1);
				XSSFCell col23 = row2.getCell(2);
				System.out.println(col21.getStringCellValue());
				System.out.println(col22.getStringCellValue());
				System.out.println(col23.getStringCellValue());
				
		*/
	}
		
	public static void main(String[] args) throws Exception
	{
		readexcelfile();

	}

}
