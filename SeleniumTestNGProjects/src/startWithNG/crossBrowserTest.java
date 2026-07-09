package startWithNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTest {
	WebDriver driver;
	
@BeforeTest
@Parameters("browser")
  public void f(String browser) {
	
	if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		
	}else if (browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		
	}else if (browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		
	}
  }

  @BeforeMethod
  public void URL() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.navigate().to("https://www.google.com/");
		
  }
  
  @Test
  public void test() {
	  WebElement serchbox = driver.findElement(By.name("q"));
	  serchbox.sendKeys("selenium", Keys.ENTER);
		
  }
  
  public void Cls() {
	driver.close();
}

}
