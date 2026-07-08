package startWithNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mouseHover {
	WebDriver driver;
	
  @Test
  public void f() {
	  Actions act = new Actions(driver);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  WebElement hover = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[5]/a"));
	  
	  act.moveToElement(hover).perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/div[2]/div[1]/nav[1]/ul/li[2]/a")).click();
	  
  }
  
  @BeforeMethod
  public void url() {
	  driver.get("https://www.ebay.com/");
  }

  @BeforeTest
  public void setup() {
	  driver = new EdgeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
