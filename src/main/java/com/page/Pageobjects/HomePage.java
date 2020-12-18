package com.page.Pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import com.page.BaseClass.BaseClass;

public class HomePage extends BaseClass {
	
	//Home Page Objects
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	By giftcards = By.xpath("//a[text()='Gift Cards']");
	
	By mobiles = By.xpath("//a[text()='Mobiles']");
	
	By todaysdeals = By.xpath("//a[contains(text(),'Today')]");
	
	By submenuall = By.xpath("//*[@class='hm-icon-label' and text()='All']");
	
	By subnewreleases = By.xpath("//*[@id='hmenu-content']/ul/li[2]/a");
	
	
	//Home Page Methods
	
	public void Clickgiftcards() {
		driver.findElement(giftcards).click();
	}
	
	public void Clickmobiles() {
		driver.findElement(mobiles).click();
	}
	
	public void Clicktodaysdeals() {
		driver.findElement(todaysdeals).click();
	}
	
	public void Clicksubmenuall() {
		driver.findElement(submenuall).click();
	}
	
	public void Clicksubnewreleases() {
		driver.findElement(subnewreleases).click();
	}
	
}
