package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ApachePoi {
	
	
public	WebDriver driver;
	
	public ApachePoi(WebDriver driver) throws IOException
	{
		this.driver=driver;
	}
	@Test
	public static String apacheTest() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("D:\\salesforce\\Excel1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		int sheets=book.getNumberOfSheets();
		String value = null;
		for(int i=0;i<sheets;i++)
		{
			String SheetName=book.getSheetAt(i).getSheetName();
			if(SheetName.equalsIgnoreCase("Data"))
			{
				XSSFSheet sheet=book.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
				
				while(rows.hasNext())
				{
					Iterator<Cell> cells=rows.next().cellIterator();
					
				if(cells.next().getStringCellValue().equalsIgnoreCase("harish"))
				{
					 value=cells.next().getStringCellValue();
				}
			
			}
		}
	}
	return value;	
	}
}
