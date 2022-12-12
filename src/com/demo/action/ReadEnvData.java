package com.demo.action;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadEnvData {

	public static String getProperties(String key) {
		ConfigPojo configParam = new ConfigPojo();
		Properties prop = new Properties();
		String value = null;
		try {
			String path = System.getProperty("user.dir")+"\\env_files\\"+configParam.getEnv()+".properties";
			System.out.println(path);			
			File f = new File(path);
			FileReader reader=new FileReader(f);		    
			prop.load(reader);
			System.out.println(prop.getProperty(key));
			value = prop.getProperty(key);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;
	}
}
