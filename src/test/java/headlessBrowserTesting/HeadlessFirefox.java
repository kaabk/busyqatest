package headlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {
	
	
public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe\\");
		
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true); 
        
	    driver = new FirefoxDriver(options);
	    driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        
	    driver.manage().window().maximize();
		
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	}
}
