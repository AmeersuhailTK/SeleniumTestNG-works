package startWithNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class boxDropDown {
	WebDriver driver;
	
  @Test
  public void test() {
	  WebElement dropdown = driver.findElement(By.tagName("select"));
	  dropdown.click();
	  
	  Select slt = new Select(dropdown);
//		slt.selectByIndex(8); //By indexing
//		slt.selectByValue("ARG"); //By Value
		slt.selectByVisibleText("Belgium");  //By Text
	  
  }
  
  @BeforeTest
  public void Brlounch() {
	  driver = new EdgeDriver();
	  driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
