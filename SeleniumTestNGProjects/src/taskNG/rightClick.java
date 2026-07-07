package taskNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class rightClick {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new EdgeDriver();
		
	}

  @BeforeMethod
  public void afterMethod() {
	  driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	  driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  
  @Test
  public void clickaction() throws InterruptedException {
	  Actions act = new Actions(driver);//methode calling
	  
	  WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	  act.contextClick(right).perform();
		
	  driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
      
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
