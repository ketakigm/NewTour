package DataDrivenTest;

import DataDrivenExample.ReadExcelFile1;

public class ReadExcelFileDemo1 
{
	
	public static void main(String[] args) 
	{
		ReadExcelFile1 rXF = new ReadExcelFile1("./src/test/Resources/FirstDataDriven.xls", "Test1");
		int rows = rXF.geNumberOftRows();
		for (int i=0; i<=rows; i++)
		{
			
				String no = rXF.getCellValue(i, 0);
				System.out.print(no);
				String name = rXF.getCellValue(i, 1);
				System.out.println(name);
				
					
		}
		
	}

}
