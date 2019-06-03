package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class without_pageclass {
	
	WebDriver driver;
	By lnc = By.linkText("Log in");
	By uname = By.id("Email");
	By pwd = By.name("Password");
	By lin = By.xpath("//input[@value='Log in']");
	public without_pageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clicklink()
	{
		driver.findElement(lnc).click();
	}
	public void typename(String username)
	{
		driver.findElement(uname).sendKeys("sss1234@gmail.com");
	}
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("sss123");
	}
	public void clickloginlin()
	{
		driver.findElement(lin).click();
	}
}
