package CaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Drivers {
  @Test
  public static WebDriver getDriver(String s) 
  {
	  if(s.equals("chrome"))
	  {
		  String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path);
		  return new ChromeDriver();
		  
	  }
	  else if(s.equals("ie"))
	  {
		  String iepath="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\IEDriverServer\\IEDriverServer.exe";
		  System.setProperty("webdriver.ie.driver", iepath);
		  return new InternetExplorerDriver();
	  }
	  else
	  {
		  return null;
	  }
  }
}
