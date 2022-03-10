package PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.Base;

public class Loginpagetest extends Base {
	
public	WebDriver driver;
	
public Loginpagetest(WebDriver driver)
{
	this.driver=driver;
}

By username=By.id("username");
By password=By.id("password");
By login=By.id("Login");

public WebElement user()
{
 return driver.findElement(username);
}
public WebElement pass()
{
 return driver.findElement(password);
}
public WebElement login()
{
 return driver.findElement(login);
}
}








