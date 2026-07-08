package taskNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class formFilling {
	WebDriver driver;
	
  @Test
  public void f() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;

//	  List<WebElement> inputs = driver.findElements(By.xpath("//input[@type='text']"));
//	  System.out.println("Total inputs: " + inputs.size());
//
//	  for (WebElement ele : inputs) {
//		  js.executeScript("arguments[0].scrollIntoView(true);", ele);
//	      js.executeScript("arguments[0].value='TEST HERE';", ele);
//	  }
//	  
	 driver.findElement(By.name("first_name")).sendKeys("Admin");
	 driver.findElement(By.name("last_name")).sendKeys("Nimda");
	 
	  WebElement email = driver.findElement(By.name("email"));
	  email.sendKeys("admin123@gmail.com");
	 
	  driver.findElement(By.name("mobile")).sendKeys("9123456789");
	  
	  WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
	  js.executeScript("arguments[0].value='10 Jul 1998';", dob);

	  WebElement subject = driver.findElement(By.cssSelector("[id='subjectsAutocomplete']"));
	  subject.sendKeys("Maths");
	  subject.sendKeys(Keys.ENTER);

	  subject.sendKeys("History");
	  subject.sendKeys(Keys.ENTER);
	  
	  WebElement maleRadio = driver.findElement(By.xpath("//*[@id=\"gender_0\"]"));
	  js.executeScript("arguments[0].click();", maleRadio);
	 
	  WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	  js.executeScript("arguments[0].click();", hobbies);
	  
	  WebElement picturebox = driver.findElement(By.name("picture"));
	  picturebox.sendKeys("C:\\Users\\Smart Axis\\Downloads\\Week 15.pdf");
	  
	  js.executeScript("arguments[0].scrollIntoView(true);",picturebox);
	  
	 
	  WebElement state = driver.findElement(By.id("state"));

	  js.executeScript("arguments[0].click();", state);
	  js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[text()='Haryana']")));

//	  WebElement state = driver.findElement(By.xpath("(//span[@class='selected-value placeholder'])[1]"));
//	  state.click();
//	  Select drop = new Select(state);
//	  drop.selectByValue("Uttar Pradesh");
	  
//	  driver.findElement(By.xpath("//div[@data-value='Uttar Pradesh']")).click();
	  
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select City']")));
	  
	  driver.findElement(By.xpath("//span[@class='selected-value placeholder']")).click();
	  driver.findElement(By.xpath("//div[@data-value='Lucknow']")).click();

	
	 
	//  driver.findElement(By.id("submit")).click();

	   
  }
  @BeforeMethod
  public void openurl() {
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.qa-practice.com/forms/practice-form");
	  	
}

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
