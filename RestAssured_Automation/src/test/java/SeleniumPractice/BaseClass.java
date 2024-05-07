package SeleniumPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	WebDriver driver; 	
	
	@BeforeClass
	public void setupApplication()
	{
		Reporter.log("==========Browser session Started==========", true); 
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwini\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver.exe"); 	
		driver = new ChromeDriver(); 	
		driver.manage().window().maximize(); 
		driver.get("https://www.pexels.com/search/website/");
		
		Reporter.log("========Application Started======", true); 
		
	}
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit(); 
		Reporter.log("==========Browser session end======", true); 
		
	}
	

	
}
