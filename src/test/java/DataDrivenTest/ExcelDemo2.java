package DataDrivenTest;

import DataDrivenExample.ReadExcelFile1;

public class ExcelDemo2 
{
    // ReadExcelFile1 rXF;// = new ReadExcelFile1("./src/test/Resources/FirstDataDriven.xls", "Test2");
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ReadExcelFile1 rXF = new ReadExcelFile1("./src/test/Resources/FirstDataDriven.xls", "Test2");
		int rows = rXF.geNumberOftRows();
		for (int i=0; i<=rows; i++)
		 {
				String no = rXF.getCellValue(i, 0);
				//System.out.print(no);
				String name = rXF.getCellValue(i, 1);
				//System.out.println(name);
				if((name.equalsIgnoreCase("y"))&& (no.equalsIgnoreCase("e")))
				{
					//int j=i+1;
					for (int j=i+1; j<=rows; j++)
					{   //String no1 = rXF.getCellValue(j, 0);
					    String name1 = rXF.getCellValue(j, 1);
						if(name1!="y")
						{
							String one = rXF.getCellValue(j, 0);
							System.out.print(one);
							//String text = rXF.getCellValue(j, 1);
							System.out.print(name1);
							System.out.println("");
						}
						else
							break;
					}
				}
					
			}
				

	}
	
}
