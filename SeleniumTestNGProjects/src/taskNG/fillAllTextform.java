package taskNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class fillAllTextform {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new EdgeDriver();
	}
	
	@BeforeTest
	public void url() {
		
	}

}
