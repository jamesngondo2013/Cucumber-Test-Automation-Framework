package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties properties;
	private static ConfigReader configReader;

	private ConfigReader() {
		BufferedReader reader;
		String propertyFilePath = "configs//Configuration.properties";
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public static ConfigReader getInstance() {
		if (configReader == null) {
			configReader = new ConfigReader();
		}
		return configReader;
	}

	public String getBaseUrl() {
		String baseUrl = properties.getProperty("BASE_URL");
		if (baseUrl != null)
			return baseUrl;
		else
			throw new RuntimeException("USER_ID not specified in the Configuration.properties file.");
	}

	public String getUserID() {
		String userId = properties.getProperty("USER_ID");
		if (userId != null)
			return userId;
		else
			throw new RuntimeException("USER_ID not specified in the Configuration.properties file.");
	}
}
