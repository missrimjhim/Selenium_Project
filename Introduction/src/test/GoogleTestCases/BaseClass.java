package test.GoogleTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import main.ApplicationPages.GoogleSearchPage;



public class BaseClass {
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() throws IOException {
		//Creating a driver object referencing WebDriver interface
		Reporter.log("=====Driver Iniialization Started=====", true);
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//properties//config.properties");
	    prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    if(browserName.equalsIgnoreCase("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium and Automation test\\drivers\\chromedriver-win64\\chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Selenium and Automation test\\browser\\chrome-win64\\chrome-win64\\chrome.exe");
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
	    }
	    driver.manage().window().maximize();
	    return driver;
	    
	}
	public GoogleSearchPage launchBrowser() throws IOException {
		driver=initializeDriver();
		GoogleSearchPage gsp=new GoogleSearchPage(driver);
		gsp.NavigateTo();
		return gsp;
		
	}
	
	public GoogleSearchPage closeApplication() throws IOException
	{
		driver=initializeDriver();
		GoogleSearchPage gsp=new GoogleSearchPage(driver);
		Reporter.log("=====Browser Session End=====", true);
		gsp.quit();
		return gsp;		
		
		
	}

}
