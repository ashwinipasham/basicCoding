package ui;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
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
