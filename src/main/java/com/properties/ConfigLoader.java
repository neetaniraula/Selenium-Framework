package com.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.constants.Constants;
import com.report.ExtentFactory;

public class ConfigLoader {
	
	private Logger logger = LogManager.getLogger(ConfigLoader.class);
	
	private Properties prop;
	
	private ConfigLoader() {
		FileReader reader = null;
		try {
			reader = new FileReader(Constants.CONFIG_FILE_PATH);
		} catch (FileNotFoundException e) {
			logger.error("Exception occured while reader config file");
			ExtentFactory.getInstance().failTest("Exception occured while reader config file");
		}
		
		prop = new Properties();
		
		try {
			prop.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Constants.EXECUTION_ENV = getPropertyValue("environment");
	}
	private static ConfigLoader instance = new ConfigLoader();
	
	public static ConfigLoader getInsatnce() {
		return instance;
	}
	
	public String getPropertyValue(String key) {
		return prop.getProperty(key);
	}
	
	
	
	
	

}
