package Testng_test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Annotations {
	@BeforeSuite
		public void beforeSuite() {
		
	}
	@AfterSuite
		public void afterSuite() {
		
	}
	@Test
	public void Test() {
		
	}
	
	@BeforeTest
		public void beforeTest() {
		
	}
	@AfterTest
		public void afterTest() {
		
	}
	@BeforeClass
		public void beforeClass() {
		
	}
	@AfterClass
		public void afterClass() {
		
	}
	@BeforeMethod
		public void beforeMethod() {
		
	}
	@AfterMethod
		public void afterMethod() {
		
	}
		
	@BeforeGroups
		public void beforeGroups() {
		
	}
	@AfterGroups
		public void afterGroups() {
		
	}
	

}
