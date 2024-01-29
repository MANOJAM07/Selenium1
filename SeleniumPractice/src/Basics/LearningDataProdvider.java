package Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProdvider {
	@Test(dataProvider = "test")
	public void disp(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name = "test")
	public Object testData()
	{
		int row=3;
		int column=3;
		String[][] data=new String[row][column];
		data[0][0]="manoj";
		data[0][1]="1234";
		data[1][0]="tanoj";
		data[1][1]="4321";
		data[2][0]="Surya";
		data[2][1]="4567";
		return data;
		
	}

}
