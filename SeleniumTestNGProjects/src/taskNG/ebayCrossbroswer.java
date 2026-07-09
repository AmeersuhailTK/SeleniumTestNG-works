package taskNG;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ebayCrossbroswer {
	    WebDriver driver;

	    @BeforeTest
	    @Parameters("Browser")
	    public void browsersetup(String browser) {

	        if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();

	        } else if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();

	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();

	        } else {
	            System.out.println("Browser not found");
	        }
	    }

	    @BeforeMethod
	    public void openURL() {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.ebay.com/");
	    }

	    @Test
	    public void ebaySearchTest() {
	        WebElement searchBox = driver.findElement(By.id("gh-ac"));
	        searchBox.sendKeys("iphone 14", Keys.ENTER);
	    }

	    @AfterTest
	    public void closeBrowser() {
	        driver.quit();
	    }
	}


