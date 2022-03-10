package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	
	public WebDriver driver;
public 	Properties prop;
	

        


	@Test
	public WebDriver implementation() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\ANUSHA\\eclipse-workspace-Real\\AutomationLive\\src\\main\\java\\Resources\\Data.properties");
		
		 prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		String UrlName=prop.getProperty("Url");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\salesforce\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
		return driver;
	}
	
		public String ScreenshotToTake(WebDriver driver,String testcaseName) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File source =ts.getScreenshotAs(OutputType.FILE);
			
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;
		
		
	}

	

}
