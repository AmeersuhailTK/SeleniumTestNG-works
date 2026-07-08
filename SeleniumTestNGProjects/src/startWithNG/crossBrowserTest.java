package startWithNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class crossBrowserTest {
	
@BeforeTest
@Parameters("browser")
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
