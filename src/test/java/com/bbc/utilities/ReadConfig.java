package com.bbc.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.lang.RuntimeException;


public class ReadConfig {
 
    //create object of Properties class to use properties files
	//
	Properties properties;
	String path = "./Configarations/config.properties";
	
	//constructor
	public ReadConfig() {
		try {
		properties = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
		
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
		String value = properties.getProperty("baseUrl");
		
		if(value!=null) 
			return value;
		
		else
			throw new RuntimeException("URL not specified");
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}
}
