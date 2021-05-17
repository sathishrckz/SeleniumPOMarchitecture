package com.page.TestCases;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.BaseClass.BaseClass;

public class TC01HomePageTest extends BaseClass {
	
	public TC01HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Test
	public void hometest() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get(prop.getProperty("baseurl"));
		System.out.println("Browser started");
		driver.manage().window().maximize();		
		driver.get(prop.getProperty("baseurl"));
		System.out.println("application opened");
		driver.quit();
		System.out.println("Browser closed");
	}
	
	
}
