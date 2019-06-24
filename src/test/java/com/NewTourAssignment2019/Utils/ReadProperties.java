package com.NewTourAssignment2019.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties 
{
	Properties myPro;
	
	public ReadProperties(String filePath)
	{
		try
		{
	      FileInputStream fis = new FileInputStream(filePath);
	      myPro = new Properties();
	      myPro.load(fis);
	    }
        catch(Exception e)
		{e.printStackTrace();
		}
	}
	
	public String getKeyValue(String key)
	{
		return myPro.getProperty(key);
	}
}
