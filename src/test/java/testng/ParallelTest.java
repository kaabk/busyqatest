package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelTest {
		
    WebDriver driver; // global
	
    @Parameters("browser")
    @BeforeTest
    public void setUp(String browse) {
      
    	if(browse.equalsIgnoreCase("Chrome")) {
    	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe\\");   
	     driver = new ChromeDriver();
    	}
    	
    	else if(browse.equalsIgnoreCase("Firefox")) {
    		
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe\\");   
   	     driver = new FirefoxDriver();
    	}
    	
    	 driver.manage().window().maximize();
		 driver.get("http://uitestpractice.com/Students/Switchto");
		  
    }
    
    @Test
	public void test() {
			   
		System.out.println("This is just a test");
	}
    
    @AfterTest
    public void endTest() {
    	driver.close();
    }
	
}
