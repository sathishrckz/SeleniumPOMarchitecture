package com.page.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	 public static WebDriver driver;
	 public static Properties prop;
	
	
	
	public BaseClass() throws IOException {	
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\SATHISH\\eclipse-workspace\\Mytestcrm\\src\\main\\java\\com\\page\\Properties\\Property.properties");
	prop.load(fis);
	}
		
		
		
	
	public static void driverlaunch(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Mytestcrm\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get(prop.getProperty("baseurl"));
	}
	}
	
	

}
