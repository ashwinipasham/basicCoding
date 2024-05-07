package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC003_DataProvider_usingTestNG {

	@Test(dataProvider="dataSet")
	public void test(String username, String password)
	{
		System.out.println(username + "===================" + password);
	}
	
	
	@DataProvider(name="dataSet")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
			{"User1" , "Pwd1"}, 
			{"User2" , "Pwd2"},
			{"User3" , "Pwd3"},
			{"User4" , "Pwd4"},
			{"User5" , "Pwd5"},			
				}; 
	}
}
