package com.gsmart.test.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	public static String getEnvProperty(String key){

		Properties properties = new Properties();

		InputStream inputSteream = null;
		try {
			inputSteream = new FileInputStream("env.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			properties.load(inputSteream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String value = properties.getProperty(key);

		return value;

	}

}
