package Testng_test.Testng_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class browser_invoke {
	WebDriver driver;
	@Test
	public void login() {
	//Creating a driver object referencing WebDriver interface
    WebDriver driver;
    
    //Setting the webdriver.chrome.driver property to its executable's location
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium and Automation test\\drivers\\chromedriver-win64\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Selenium and Automation test\\browser\\chrome-win64\\chrome-win64\\chrome.exe");
	options.addArguments("--remote-allow-origins=*");
    //Instantiating driver object
    driver = new ChromeDriver(options);
    
    //Using get() method to open a webpage
    driver.get("https://artoftesting.com");
    
    
    //Closing the browser
    driver.quit();

}

}
