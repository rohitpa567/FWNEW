package com.cs.reports;

import java.util.Date;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {

	private ExtentReport() {
	}

	private static ExtentReports extent;

	public static ExtentTest test;

	public static void initReports() {
		if (Objects.isNull(extent)) {

			extent = new ExtentReports();

			ExtentSparkReporter spark = new ExtentSparkReporter(
					// System.getProperty("user.dir") + "/src/test/resources/extent-reports/index_"+System.currentTimeMillis()
					// +".html");
					System.getProperty("user.dir") + "/src/test/resources/extent-reports/"
							+ new Date().toString().replace(" ", "_").replace(":", "_")+ "index.html");

			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Cyber Success Automation");
			spark.config().setReportName("CS Automation Report");
		}
	}

	static public void flushreports() {
		if (Objects.nonNull(extent))
			extent.flush();
	}

	static public void createTest(String testcasename) {
		// test = extent.createTest(testcasename);

		ExtentManager.setExtentTest(extent.createTest(testcasename));
	}

}
