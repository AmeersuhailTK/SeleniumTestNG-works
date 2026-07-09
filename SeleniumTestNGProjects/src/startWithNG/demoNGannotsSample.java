package startWithNG;

import org.testng.annotations.Test;

import org.testng.annotations.*;

public class demoNGannotsSample {

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println(">>> BeforeSuite: Runs once before entire suite");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println(">>> BeforeTest: Runs before <test> tag in XML");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println(">>> BeforeClass: Runs before the first @Test method in this class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println(">>> BeforeMethod: Runs before EACH @Test method");
	    }

	    @Test
	    public void test1() {
	        System.out.println(">>> Test1: This is the first test method");
	    }

	    @Test
	    public void test2() {
	        System.out.println(">>> Test2: This is the second test method");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println(">>> AfterMethod: Runs after EACH @Test method");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println(">>> AfterClass: Runs after all @Test methods in this class");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println(">>> AfterTest: Runs after <test> tag in XML");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println(">>> AfterSuite: Runs once after entire suite");
	    }
	}


