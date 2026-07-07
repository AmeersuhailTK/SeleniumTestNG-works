package taskNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class iframeInputText {
	WebDriver driver;
	
  @Test
  public void f() {
	  WebElement fsingl = driver.findElement(By.xpath("//a[@href='#Single']"));
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();", fsingl);
	
	  driver.switchTo().frame(0);
	  driver.findElement(By.cssSelector("[type='text']")).sendKeys("TEXT HERE");
		
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new EdgeDriver();
	  driver.get("https://demo.automationtesting.in/Frames.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}
