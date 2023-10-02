package main.ApplicationPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.GoogleTestCases.BaseClass;
public  class GoogleSearchPage extends BaseClass{
	WebDriver driver;
	 //constructor
	public GoogleSearchPage(WebDriver driver) {
		//super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
//	Actions a= new Actions(driver);
//	public WebElement text_box= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//	 WebElement search_button= driver.findElement(By.xpath("//input[@class='gNO89b']"));
	@FindBy(xpath="//textarea[@id='APjFqb']")
	WebElement text_box;
	@FindBy(xpath="//input[@class='gNO89b']")
	WebElement search_button;
	public  void NavigateTo() {
		driver.get("https://google.co.in/");
	}
	
	public  void Textsearch(String text) {
		
		text_box.sendKeys(text);
		text_box.sendKeys(Keys.RETURN);
	}
	public  void quit() {
		driver.close();
	}
	
	
	

}
