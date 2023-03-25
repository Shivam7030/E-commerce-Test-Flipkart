package com.flipkart.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {
	public static String getLocator(String locator) throws IOException {
		String fileName = "/src/test/resources/OR.properties";
		return getProperty(fileName, locator);
	}

	public static String getProperty(String fileName, String key) throws IOException {
		String dir = System.getProperty("user.dir");
		FileInputStream fls = new FileInputStream(dir + fileName);
		Properties pro = new Properties();
		pro.load(fls);
		return pro.getProperty(key);
	}
	
	public static String getEnvironment(String key) throws IOException {
		String fileName = "/src/main/resources/environment.properties";
		return getProperty(fileName, key);
	}

}
