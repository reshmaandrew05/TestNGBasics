package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Executing before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Execute before test");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Execute before class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Execute before method");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Execute before test case");
	}

	@Test
	public void Testcase1() {
		System.out.println("Execute on testcase");
	}
	
	@Test
	public void Testcase2()
	{
		System.out.println("Execute testcase2");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("Execute after test case");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Execute after method");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("Execute after class");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("Execute after suite");
	}

}
