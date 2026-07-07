package taskNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class mulWindowHandl {
	
	WebDriver driver;
	
  @Test
  public void windowtest() {
	  

	  String currentwindow = driver.getWindowHandle();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  WebElement tab = driver.findElement(By.xpath("//a[@href='#Tabbed']"));
	  tab.click();
	  
	  WebElement clickbtn = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
	  js.executeScript("arguments[0].click();", clickbtn);
	  
	  
	  Set<String> allwindows =   driver.getWindowHandles();
		for (String newwindo : allwindows) {
			if (!newwindo.equals(currentwindow)) {
				driver.switchTo().window(newwindo);
			}
		}
		
		driver.findElement(By.linkText("About")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		wait.until(ExpectedConditions.visibilityOf((WebElement) By.linkText("About")));
		
		
		driver.switchTo().window(currentwindow);
		
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new EdgeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.close();
	  
  }
  

}
