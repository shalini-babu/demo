package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlineShopping {
	 public WebDriver driver;
	@BeforeClass
	public void drivers()
	{
		    
		    driver = Drivers.getDriver("chrome");
		    driver.get("http://10.232.237.143:443/TestMeApp/"); 
	}
	@AfterClass
	public void closeBrowser()
	   {
		 driver.close();
	   }
  @Test(priority=1)
  public void testRegistration() throws InterruptedException 
  {
	  driver.findElement(By.linkText("SignUp")).click();
	  driver.findElement(By.name("userName")).sendKeys("supretha2134");
	  driver.findElement(By.id("err")).click();
      String unava = driver.findElement(By.cssSelector("#err")).getText();
	  //System.out.println(unava);
	  if(unava.equals("Available"))
	  {	
	  driver.findElement(By.name("firstName")).sendKeys("supi");
	  Thread.sleep(3000);
	  driver.findElement(By.name("lastName")).sendKeys("babu");
	  Thread.sleep(5000);
	  driver.findElement(By.name("password")).sendKeys("sss1234");
	  Thread.sleep(3000);
	  driver.findElement(By.name("confirmPassword")).sendKeys("sss1234");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//input[@id='gender'])[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("emailAddress")).sendKeys("sss@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("mobileNumber")).sendKeys("9235757268");
	  Thread.sleep(3000);
	  driver.findElement(By.id("dob")).sendKeys("05/03/1998");
	  Thread.sleep(5000);
	  driver.findElement(By.name("address")).sendKeys("chennai,TamilNadu");
	  Thread.sleep(3000);
	  WebElement ques = driver.findElement(By.name("securityQuestion"));
	  Thread.sleep(3000);
	  Actions actions=new Actions(driver);
	  actions.sendKeys(ques,Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  driver.findElement(By.name("answer")).sendKeys("pinky");
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(3000);
	  }
  }
  @Test(priority=3)
  public void testCart() throws InterruptedException 
  {
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//ul[@id='menu3']/li[2]/a/span"))).perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Electronics')]"))).click().build().perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Travel Kit')]"))).click().build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Add to cart")).click();
	  //Thread.sleep(3000);
	  //driver.findElement(By.name("userName")).sendKeys("supreetha");
	  //Thread.sleep(3000);
	 // driver.findElement(By.name("password")).sendKeys("sss1234");
	  //Thread.sleep(3000);
	  //driver.findElement(By.name("Login")).click();
	  //Thread.sleep(3000);
	  //act.moveToElement(driver.findElement(By.xpath("//ul[@id='menu3']/li[2]/a/span"))).perform();
	  //Thread.sleep(3000);
	  //act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Electronics')]"))).click().build().perform();
	  //Thread.sleep(3000);
	  //act.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Travel Kit')]"))).click().build().perform();
	  //Thread.sleep(3000);
	  //driver.findElement(By.linkText("Add to cart")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[contains(@href, 'displayCart.htm')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Checkout")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath("//input[@value='Back']")).click();
	  //Thread.sleep(3000);
	  //driver.findElement(By.linkText("Home")).click();
	  //Thread.sleep(3000);

  }

  @Test(priority=2)
  public void testLogin() 
  {
	  driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("supreetha");
	  driver.findElement(By.name("password")).sendKeys("sss1234");
	  driver.findElement(By.name("Login")).click();
  }
  @Test(priority=4)
  public void testPayment() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[2]/div[2]/div/label/i")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys("supreetha");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("sss1234");

	  Thread.sleep(3000);

	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  //driver.close();
  }
}
