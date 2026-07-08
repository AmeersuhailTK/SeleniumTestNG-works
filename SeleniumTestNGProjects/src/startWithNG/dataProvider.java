package startWithNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import org.testng.Assert;

public class dataProvider {
	
	//this method act as data while login
	
	@DataProvider(name = "LoginData") //passing parameter
	public Object[][] provideLoginData() {
		return new Object[][] {
			{"validUser","validPassword",true},
			{"invalidUser1","wrongPassword1",false},
			{"invalidUser2","validPassword2",false}
		};
	}
	
  @Test(dataProvider = "LoginData")
  public void testLogin(String username, String password, boolean expectedResult) {
	  
	  System.out.println("Testing Login with usename: "+ username + "password: "+ password);
	  
	  boolean actualResult = performLogin(username,password);
	  
	  Assert.assertEquals(actualResult, expectedResult, "Login test failed with user: "+ username);
  }
  
  private boolean performLogin(String usename, String password) {
	  
	  if ("validUser".equals(usename) && "validPassword".equals(password)) {
		  return true;
	}
	  else {
		return false;
	}
  }
  

}
