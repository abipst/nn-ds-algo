package dsalgo_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties properties;

	public final String configFilePath= "src/test/resources/config/config.properties";

	private static String browser;
			
	public ConfigReader() {
		
		loadProperties();
		
        if (browser == null) {
        	
            browser = properties.getProperty("browser"); 
        }
	}
	
	private void loadProperties() {
		
        File configFile = new File(configFilePath);

        try (FileInputStream configFileReader = new FileInputStream(configFile)) {
        	
            properties = new Properties();
            
            properties.load(configFileReader);
            
        } catch (FileNotFoundException e) {
        	
            e.printStackTrace();
            
            throw new RuntimeException("config.properties not found at config file path " + configFilePath);
            
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
        
    }

	public String getBrowser() {
		
		if(browser != null)

			return browser;

		else
			throw new RuntimeException("browser not specified in the config.properties file");
		
	}

	public void setBrowser(String browser) {
		
		ConfigReader.browser = browser;
		
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
	
	
	public String getExcelpath() {

		String excelPath= properties.getProperty("excel.path");

		if(excelPath != null)

			return excelPath;

		else
			throw new RuntimeException("excel path not specified in the config.properties file");

	}

}
