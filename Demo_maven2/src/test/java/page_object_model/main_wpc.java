package page_object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class main_wpc {
  @Test
  public void f() {
	  String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	    WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/"); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    with_pageclass locateElements = PageFactory.initElements(driver, with_pageclass.class);
	    locateElements.loginMethod("shalini1234@gmail.com", "sss123");
  }
}
