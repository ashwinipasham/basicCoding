package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TC004_DataProvider_usingTestNG2_Loginpage {

	@Test(dataProvider="loginPage")
	public void test(String username, String password)
	{
		 //WebdriverManager.chromedriver().setup(); 
		// System.setProperty("webdrriver.chromedriver", "C://Users//Ashwini//Documents//Selenium tools//chrome-win64");
		 ChromeDriver driver = new ChromeDriver(); 
		 driver.get("https://www.saucedemo.com/");
		 
		 driver.findElement(By.id("username")).sendKeys(username);; 
		 driver.findElement(By.id("password")).sendKeys(password); ; 
		 driver.findElement(By.id("login-button")).click(); 
		 driver.close(); 		 
	}
		
	@DataProvider(name="loginPage")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
			{"standard_user" , "secret_sauce"}, 
			{"locked_out_user" , "secret_sauce"},
			{"performance_glitch_user" , "secret_sauce"},
			{"error_user" , "secret_sauce"},
			{"visual_user" , "secret_sauce"},			
				}; 
	}
}
