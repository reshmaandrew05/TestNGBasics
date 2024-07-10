package assiegnmentWorks;

import org.testng.annotations.DataProvider;


public class DataProviders {
	
	@DataProvider(name="details")
	public Object[][] personDetails()
	{
		return new Object[][]{{"Reena","Kurian","rk12","London","UK","68201"},{"Meera","Hari","mhae","Alapuzha","Kerala","28501"},{"Jithin","Ravi","jr2334","Kochi","Kerala","683501"}};
		
	}
	

}
