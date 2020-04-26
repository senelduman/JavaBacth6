package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\senel\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";

		FileInputStream fileInput = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fileInput);
		
		prop.getProperty("name");
		String name =prop.getProperty("name");
		System.out.println(name);
		String city =prop.getProperty("city");
	     System.out.println(city);
	     
	     Set<Object>keys=prop.keySet();
	     for (Object key:keys) {
	    	 System.out.println(key);
		}
	     
	    
	
	}

}
