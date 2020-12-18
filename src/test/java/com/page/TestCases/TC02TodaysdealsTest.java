package com.page.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.BaseClass.BaseClass;
import com.page.Pageobjects.HomePage;
import com.page.Pageobjects.MobilePage;

public class TC02TodaysdealsTest extends BaseClass {
	
	HomePage hp = new HomePage();
	MobilePage mp = new MobilePage();
	
	public TC02TodaysdealsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void browserlaunch() {
		driverlaunch("chrome");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Todaysdelastest() {
		driver.get(prop.getProperty("baseurl"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.Clicksubmenuall();
		hp.Clicktodaysdeals();
	
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
