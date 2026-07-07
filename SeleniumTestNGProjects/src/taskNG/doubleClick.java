package taskNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class doubleClick {
	WebDriver driver;
	
  @Test
  public void f() {
	  Actions act = new Actions(driver);
	  
	  WebElement Dclick =  driver.findElement(By.cssSelector("[ondblclick='myFunction()']"));
	  act.doubleClick(Dclick).perform();
		
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	  driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
