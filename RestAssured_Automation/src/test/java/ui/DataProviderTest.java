package ui;

import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="dataSet", dataProviderClass = DataProviderDemo.class)
	public void test(String username, String password)
	{
		System.out.println(username + "===================" + password);
	}

}
