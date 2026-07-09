package startWithNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderLogIn {
	WebDriver driver;
	
  @Test(dataProvider = "getLoginData")
  public void logInTest(String username, String password) throws InterruptedException {
	  WebElement uname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	  uname.sendKeys(username);
	  
	  WebElement Pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	  Pwd.sendKeys(password);
	  
	  WebElement submit = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	  submit.click();
	  
	  uname.clear();
      Pwd.clear();
      Thread.sleep(5000);
  }
  
  @DataProvider(name = "getLoginData")
  public Object[][] data() {
	  return new Object[][] {
		new Object[] {"user1","abcd123"},
		new Object[] {"user2","bcd1234"},
		new Object[] {"user3","bkj899"},
		new Object[] {"user4","hnmj45"}
	  };
  }
  
  @BeforeMethod
  public void setup() {
	  driver = new EdgeDriver();
	  driver.navigate().to("https://omayo.blogspot.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  @AfterTest
  public void complete() {
	driver.close();
}
}
