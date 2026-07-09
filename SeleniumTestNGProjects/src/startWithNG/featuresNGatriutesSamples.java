package startWithNG;

import org.testng.annotations.Test;

public class featuresNGatriutesSamples {

	    @Test(priority = 1, description = "This is the login test")
	    public void loginTest() {
	        System.out.println(">>> loginTest executed");
	    }

	    @Test(priority = 2, dependsOnMethods = "loginTest", description = "Runs only after loginTest")
	    public void dashboardTest() {
	        System.out.println(">>> dashboardTest executed");
	    }

	    @Test(priority = 3, enabled = false, description = "This test is disabled")
	    public void disabledTest() {
	        System.out.println(">>> disabledTest executed");
	    }

	    @Test(priority = 4, invocationCount = 3, description = "Runs 3 times")
	    public void repeatTest() {
	        System.out.println(">>> repeatTest executed");
	    }

	    @Test(priority = 5, timeOut = 2000, description = "Must finish within 2 seconds")
	    public void timeoutTest() throws InterruptedException {
	        System.out.println(">>> timeoutTest executed");
	        Thread.sleep(1000);
	    }

	    @Test(priority = 6, groups = {"smoke"}, description = "Smoke test group")
	    public void smokeTest() {
	        System.out.println(">>> smokeTest executed");
	    }
	}

