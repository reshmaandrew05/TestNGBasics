package basics;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="Searchitem")
	public Object[][] amazonSearch()
	{
		return new Object [][] {{"shoe"},{"watch"},{"phone"},{"Dress"}};
	}
	@DataProvider(name="credentials")
	public Object[][] UserAndPwd()//multidimensional object array is used here
	{
		return new Object [][] {{"userName","Email id"},{"UserName2","Emaild id1"},{"UserName3","password3"}};
	}
}
