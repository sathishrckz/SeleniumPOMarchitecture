package com.page.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.BaseClass.BaseClass;

public class TC01HomePageTest extends BaseClass {
	
	public TC01HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void browserlaunch() {
		driverlaunch("chrome");
		driver.manage().window().maximize();
	}

	@Test
	public void hometest() throws IOException {
		
		driver.get(prop.getProperty("baseurl"));
		
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

}
