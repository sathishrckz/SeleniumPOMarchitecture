package com.page.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.page.BaseClass.BaseClass;

public class TestListener  extends BaseClass implements ITestListener {

	String filepath  = "C:\\Users\\SATHISH\\eclipse-workspace\\Mytestcrm\\ScreenShot";
	public TestListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("********* Pass****"+result.getName().toString().trim());
		String methodname = result.getName().toString().trim();
		ITestContext context = result.getTestContext();
		driver = (WebDriver)context.getAttribute("driver");
		//Takescreenshot(methodname);
	}
	
	/*public void Takescreenshot(String methodname) {
		 
		File image1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("image captured");
		try {
			FileUtils.copyFile(image1, new File(filepath+methodname+".png"));
			System.out.println(methodname+" Screenshot saved in the path "+filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
		
	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
