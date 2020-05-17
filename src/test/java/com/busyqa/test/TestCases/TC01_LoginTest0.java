package com.busyqa.test.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.busyqa.test.excelReader.*;

public class TC01_LoginTest0 {

	 WebDriver driver;
	 WebElement username;
	 WebElement password;
	 WebElement loginbtn;
	 int i;
	 ExcelReader excel;
	 String filepath=System.getProperty("user.dir") + "\\Resources\\Data\\";
	 ArrayList<String> login_cred = new ArrayList<String>();
	 String email_id="";
	 String pass="";
	 

    
	 void setUp() {
		 	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe\\");
			
		    driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().window().maximize();
		    
		    username = driver.findElement(By.id("txtUsername"));
		    password = driver.findElement(By.id("txtPassword"));
		    loginbtn = driver.findElement(By.id("btnLogin"));
		  
	}
	

	 void loginTest01() {
		
		   excel = new ExcelReader(); //Excel_Reader Class
		   int row_num = 1;
		   login_cred=excel.getCellData(filepath,"loginData.xlsx", "login",row_num);
		
			email_id=login_cred.get(0);
			pass=login_cred.get(1);
			System.out.println("Email id for the TC " + row_num + " is: " + email_id);
			System.out.println("Password for the TC " + row_num + " is: " + pass); 
			
			
			username.sendKeys(email_id);
			password.sendKeys(pass);
			loginbtn.click();
			
			String errormessage = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
			
			excel.writeCellData(filepath,"loginData.xlsx", "NewSheet", "Executed");	

			excel.updateCellData(filepath,"loginData.xlsx", "login",row_num, errormessage);
		   
		    excel.newSheet(filepath,"newSheet.xlsx", "test");
		   
			
	}


	 
	 
    public void endTest() {
    	
    	
    	
    }
	public static void main(String[] args) {
		TC01_LoginTest0 tc01 = new TC01_LoginTest0();
		tc01.setUp();
		tc01.loginTest01();
	}

}

