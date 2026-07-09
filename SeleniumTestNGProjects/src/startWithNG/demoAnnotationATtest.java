package startWithNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoAnnotationATtest {
	
	
  @Test(priority = 1) // runs first
  @Parameters({"username","password"})
  public void logintest(String usenam, String password) {
	  System.out.println("Login with");
	  System.out.println("username "+ usenam);
	  System.out.println("password "+ password);
  }
  //Repeat Test
  @Test(priority = 2 , invocationCount = 3)
  public void repeatedTest() {
	  System.out.println("This test runs 3 repeat times");
	
  }
  @Test(priority = 3, dependsOnMethods = "logintest")
  public void checkDashboard() {
	  System.out.println("Dashboad check after Login");
	
  }
  //skipped tst
  @Test(enabled = false)
  public void skipTest() {
	System.out.println("you won't see this");
}
}
