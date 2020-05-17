package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	
   @Parameters("test")
   @Test
   public void test(String str) {
	   System.out.println("Value is: " + str);
	   
   }
   
   @Parameters({"user", "pass"})
   @Test
   public void test1(String username, String password) {
	   System.out.println("Username is: " + username + " and password is: " + password);
	   
   }
}
