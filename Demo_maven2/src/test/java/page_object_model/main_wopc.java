package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_wopc {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	    WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		without_pageclass Pobject= new without_pageclass(driver);
		driver.get("http://demowebshop.tricentis.com/"); 
	    driver.manage().window().maximize();
	    Pobject.clicklink();
	    String username=null;
	    Pobject.typename(username);
	    String password = null;
	    Pobject.typepassword(password);
	    Pobject.clickloginlin();
	    System.out.println("title of the page is "+driver.getTitle());
	}

}
