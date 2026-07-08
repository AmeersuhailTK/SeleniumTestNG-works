package startWithNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class dragNdrop {
	WebDriver driver;
	
  @BeforeMethod
  public void functions() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	  
  }
  
  @Test
  public void url() {
	  
	  Actions act = new Actions(driver);
	  
	  driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	  WebElement fromD = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	  WebElement toD = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	  
	  act.dragAndDrop(fromD, toD).perform();
	  
	  WebElement fromC = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	  WebElement toC = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	  
	  act.dragAndDrop(fromC, toC).perform();
	 
	  WebElement from1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	  WebElement to1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	  
	  act.dragAndDrop(from1, to1).perform();
	  
	  WebElement from2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	  WebElement to2 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	  
	  act.dragAndDrop(from2, to2).perform();
	
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  	
  }

}
