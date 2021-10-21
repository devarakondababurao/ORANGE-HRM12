package test001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest06 

{
	
	

	
	WebDriver driver;
  @Test
  public void TC0001() 
  
  {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	  
 
  }
  
  
}
