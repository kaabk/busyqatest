package headlessBrowserTesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver {
		
	public static void main(String[] args) throws Exception {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
	    driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        
	    driver.manage().window().maximize();
		
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());	
	    
	    driver.quit();
	}
}
