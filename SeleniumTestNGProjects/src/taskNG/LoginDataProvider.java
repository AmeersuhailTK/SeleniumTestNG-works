package taskNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class LoginDataProvider {
	 WebDriver driver;
	 


	    @DataProvider(name = "LoginData")
	    public Object[][] getLoginData() {
	        return new Object[][] {
	        	{"testUser", "test123", false},
	            {"wrongUser", "admin123", false},
	            {"admin", "wrongPass", false},
	            {"student", "Password123", true}
	        };
	    }
	
	    @BeforeMethod
	    public void setup() {
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://practicetestautomation.com/practice-test-login/");   // real-world login page
	     
	       

	    }

	    @Test(dataProvider = "LoginData", dataProviderClass = LoginDataProvider.class)
	    public void testLogin(String username, String password, boolean expectedResult) {

	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("submit")).click();
       
	        
	        
	        boolean actualResult;

	        try {
	            actualResult = driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']")).isDisplayed();
	        } catch (Exception e) {
	            actualResult = false;
	        }

	        Assert.assertEquals(actualResult, expectedResult,
	                "Login test failed for user: " + username);
	    }
	}

	
	


