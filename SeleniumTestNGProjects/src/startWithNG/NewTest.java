package startWithNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	//global method declaration for all classes
	WebDriver driver; 
	
  @Test  //main face of test
  public void fileUploader() {
	  driver.get("https://www.qa-practice.com/forms/practice-form");
	  driver.findElement(By.name("picture")).sendKeys("C:\\Users\\Smart Axis\\Downloads");
	 

  }
  @BeforeMethod  
  public void beforeMethod() {
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement element = driver.findElement(By.name("picture"));
	  js.executeScript("arguments[0].scrollIntoView(true);", element);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	driver.close();  
  }

}
