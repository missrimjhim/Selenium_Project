package test.GoogleTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;

import main.ApplicationPages.GoogleSearchPage;

public class GoogleTestcases extends BaseClass {
	

	WebDriver driver;
	
	@Test
	public void testcase1_login_search_close() throws IOException {
		
        Reporter.log("=====testcase Session Started=====", true);
		GoogleSearchPage gsp=launchBrowser();
		gsp.Textsearch("Dog");
		gsp.quit();
		Reporter.log("=====testcase Session ended=====", true);
	}

}
