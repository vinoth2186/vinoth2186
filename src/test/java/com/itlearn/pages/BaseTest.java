package com.itlearn.pages;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import com.itlearn.utility.BrowserFactory;
import com.itlearn.utility.ConfigDataProviders;

public class BaseTest {
	public WebDriver driver;
	public ConfigDataProviders config;	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
	}
	
 @AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
}
