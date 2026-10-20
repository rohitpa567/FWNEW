package com.cs.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.cs.constants.Frameworkconstants;
import com.cs.enums.ConfigProperties;

public final class PropertyUtils {

	private PropertyUtils() {
	}

	private static Properties prop = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	static {

		try {

			FileInputStream fis = new FileInputStream(Frameworkconstants.getConfigpath());
			prop.load(fis);// memory stores key value

			for (Map.Entry<Object, Object> entry : prop.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace( 	);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static String get(ConfigProperties key) throws Exception {
		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
			throw new Exception("problem in reading property " + key + " please check config.properties file");
		return CONFIGMAP.get(key.name().toLowerCase());
	}

}

/*
 * public static String getValue(String key) throws Exception { Properties prop
 * = new Properties(); FileInputStream fis = new FileInputStream(
 * System.getProperty("user.dir") +
 * "/src/test/resources/config/config.properties"); prop.load(fis);// memory
 * stores key value String value = prop.getProperty(key); if
 * (Objects.isNull(value)) throw new Exception("problem in reading property " +
 * key + "please check config.properties file");
 * 
 * else {
 * 
 * return value; } }
 */
