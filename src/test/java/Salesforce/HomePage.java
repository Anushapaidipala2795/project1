package Salesforce;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven.ApachePoi;
import PageObjectClasses.Loginpagetest;
import Resources.*;

public class HomePage extends Base  {
	
	
	@BeforeTest
	public void initializer() throws IOException
	{
		driver=implementation();	
	}
	@Test
	public void HomepageImplementation() throws SQLException, IOException 
	{
		
		driver.get(prop.getProperty("Url"));
		Loginpagetest lp=new Loginpagetest(driver);
		lp.user().sendKeys("dsfsfs");
        System.out.println(DataBase.connection());
        System.out.println(DataBase.connection());
        System.out.println(DataBase.connection());
        lp.pass().sendKeys("sdsd");;
		lp.login().click();
		System.out.println(ApachePoi.apacheTest());

		System.out.println("hello");
		System.out.println("hi");

		System.out.println("this from alpha");
		System.out.println("successfully implemented in master ranch");

		System.out.println("final merging from alpha");


//        Loginpagetest lp1=new Loginpagetest(driver);
//		
//		lp1.user().sendKeys(uss);
//        
//		lp1.pass().sendKeys(puss);
//		lp1.login().click();
//		
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj= new Object[2][2];
		obj[0][0]="dfsf";
		obj[0][1]="fcvcxxv";
		
		obj[1][0]="xdf";
		obj[1][1]="eer";
				
	return	obj;
	}

}
