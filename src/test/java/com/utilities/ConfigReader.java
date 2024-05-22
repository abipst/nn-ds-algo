package com.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties properties;

	public final String configFilePath= "src/test/resources/config/config.properties";
			
	public ConfigReader() {

		File  configFile = new File(configFilePath);

		try {

		FileInputStream configFileReader = new FileInputStream(configFile);

	    properties = new Properties();

	      try {

	    	  properties.load(configFileReader);

	    	  configFileReader.close();

	      } catch (IOException e) {
	    	  
	    	  e.printStackTrace();

	      }
	      
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();

	        throw new RuntimeException ("config.properties not found at config file path "+configFilePath);

	      }
	}
		
	public String getApplicationUrl() {

		String applicationurl= properties.getProperty("url");

		if(applicationurl != null)
			
			return applicationurl;

		else
			throw new RuntimeException("url not specified in the config.properties file");

	}


	public String getUserName() {

		String username= properties.getProperty("username");

		if(username != null)

			return username;

		else
			throw new RuntimeException("username not specified in the config.properties file");

	}


	public String getPassword() {

		String password= properties.getProperty("password");

		if(password != null)

			return password;

		else

			throw new RuntimeException("password not specified in the config.properties file");

		}


	public String getBrowser() {

		String browser= properties.getProperty("browser");

		if(browser != null)

			return browser;

		else
			throw new RuntimeException("browser not specified in the config.properties file");

	}

}
	