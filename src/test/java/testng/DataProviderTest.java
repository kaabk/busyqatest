package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
		
	WebDriver driver;
	WebElement username;
	 WebElement password;
	 WebElement loginbtn;
	 
	@BeforeTest
	public void setUp() {
		
		// chrome path
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe\\");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	@Test(dataProvider="users")
	public void test(String user, String pass) {
		driver.get("https://opensource-demo.orangehrmlive.com/"); // url
		username = driver.findElement(By.id("txtUsername"));
	    password = driver.findElement(By.id("txtPassword"));
	    loginbtn = driver.findElement(By.id("btnLogin"));
	    
	    username.sendKeys(user);
	    password.sendKeys(pass);
	    loginbtn.click();
	    
	}
	
	@DataProvider(name="users")
	String [][] loginData(){
		
		String data[][] = {{"admin123", "admin123"}, {"Admin", "admin123"}};
		return data;
	}
	
	
}
