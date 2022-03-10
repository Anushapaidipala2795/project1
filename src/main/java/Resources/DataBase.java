package Resources;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataBase extends Base{
	
	public	WebDriver driver;
	
	public DataBase(WebDriver driver) throws IOException
	{
		this.driver=driver;
	}
	
	public ResultSet rs;
	@Test
	public static String connection() throws SQLException
	{
		String username="root";
		String host="localhost";
		String password="root";
		String port="3306";
		String a1 = null;
		
	
	Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "root");
	
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select name from EmployeeInfo where Location='Lalapet';");
	while(rs.next())
	{
	 a1= rs.getString("name");
	
	}
return a1;
	}

}
