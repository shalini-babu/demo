package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cart {
	String baseurl = "http://10.232.237.143:443/TestMeApp/";
String s = "C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
public WebDriver driver;

 @BeforeClass
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", s);
	  driver = new ChromeDriver();
	  driver.get(baseurl);
	  
  }
  
   @AfterClass
   public void closeBrowser()
   {
	 driver.close();
   }
  @Test
  public void f() throws InterruptedException {
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//ul[@id='menu3']/li[2]/a/span"))).perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Electronics')]"))).click().build().perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Travel Kit')]"))).click().build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Add to cart")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("userName")).sendKeys("supreetha");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("sss1234");
	  Thread.sleep(3000);
	  driver.findElement(By.name("Login")).click();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//ul[@id='menu3']/li[2]/a/span"))).perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Electronics')]"))).click().build().perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Travel Kit')]"))).click().build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Add to cart")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[contains(@href, 'displayCart.htm')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Checkout")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@value='Back']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Home")).click();
	  Thread.sleep(3000);
  }
  
}
