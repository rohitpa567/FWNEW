package com.cs.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cs.enums.ConfigProperties;
import com.cs.utils.PropertyUtils;

public class Driver {

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {

			String browser = PropertyUtils.get(ConfigProperties.BROWSER);

			if ("chrome".equalsIgnoreCase(browser)) {

				WebDriver chrome = new ChromeDriver();

				DriverManager.setDriver(chrome);

			} else {

				throw new Exception("Invalid browser name: [" + browser + "]");
			}

			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));

			DriverManager.getDriver().manage().window().maximize();

			}
	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();

			DriverManager.unload();
		}
	}
}
