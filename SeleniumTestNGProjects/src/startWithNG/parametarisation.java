package startWithNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametarisation {
	
	@Parameters({"p"})
	@Test
	public void m(String s) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.google.com/");
		WebElement serchbox = driver.findElement(By.name("q"));
		serchbox.sendKeys(s);
		serchbox.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		
  }
}
//check it with named XML file
