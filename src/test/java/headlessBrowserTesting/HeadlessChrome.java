package headlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
		   
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe\\");
	    ChromeOptions options = new ChromeOptions();
	    options.setHeadless(true); // options.addArguments("--headless");
        
	    driver = new ChromeDriver(options);
	    driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        
	    driver.manage().window().maximize();
		
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());	
	}
}
