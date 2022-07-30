package com.adactin.testrunner;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", 
glue = "com.adactin.stepdefinition", monochrome = true, dryRun = false, strict = true,
plugin = {"html:Report/Html_Report",
		"pretty",
		"json:Report/Json_report.jason",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"
}
)
public class Runner_Class {
public static WebDriver driver;  //null

@BeforeClass
	public static void setUp() throws IOException {
	String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		driver = Base_Class.getBrowser(browser);
	}
@AfterClass
public static void tearDown() {
  driver=Base_Class.close();
}

}
