package com.page.Pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import com.page.BaseClass.BaseClass;

public class MobilePage extends BaseClass {
	public MobilePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Mobile Page Objects
	By mobileaccessories = By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]");
	
	//Mobile Page Methods
	public void clickmobileaccessories() {
	driver.findElement(mobileaccessories).click();
	}
}
