package com.busyqa.test.TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
	public WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/";
	String browser_path= "\\Resources\\Drivers\\chromedriver.exe\\";
    String browser = "chrome";
    String env = "qa";
	
	public void init() {
		selectBrowser(browser, browser_path);
		getUrl(env, url);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}


	public void selectBrowser(String browser, String browser_path) {
	if (browser.equalsIgnoreCase("Chrome")){
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+browser_path);
		driver=new ChromeDriver();
	}
	
	else if (browser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.mozilla.driver",System.getProperty("user.dir")+browser_path);
		driver=new FirefoxDriver();
	}
	
	else {
		log.info("There is no match for the browser type");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
 }
	public void getUrl(String env, String url) {
		
		if(env.equalsIgnoreCase("dev")) {
		log.info("Navigating to:"+url);
		driver.get(url);
		}
		
		else if(env.equalsIgnoreCase("qa")) {
			log.info("Navigating to:"+url);
			driver.get(url);
		}
		
		else if(env.equalsIgnoreCase("prod")) {
			log.info("Navigating to:"+url);
			driver.get(url);
		}
		
		}
}