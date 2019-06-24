package DataDrivenExample;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelFile1 {

	/*public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}*/
	HSSFWorkbook workBook;
	HSSFSheet sheet;
	
	public ReadExcelFile1( String filePath, String sheetName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			workBook = new HSSFWorkbook(fis);
			sheet= workBook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getCellValue(int rowIndex, int colunmIndex)
	{
		HSSFRow row= sheet.getRow(rowIndex);
		HSSFCell cell = row.getCell(colunmIndex);
		return cell.toString();
	}
	
	public int geNumberOftRows()
	{
		return sheet.getLastRowNum();
	}
	

}
