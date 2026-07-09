package startWithNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametarisation {
	WebDriver driver;
	
	
	@Parameters({"p"}) //Parameterization  declare a "p" value
	@Test //with value 
	public void pagesetup(String s) throws InterruptedException {
		
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.google.com/");
		WebElement serchbox = driver.findElement(By.name("q"));
		serchbox.sendKeys(s); //method passes 
		serchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
  }
	
	@AfterTest
	public void end() {
		driver.quit();
	}
}
//check it with named XML file
