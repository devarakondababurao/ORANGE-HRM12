package babu.A1_Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs_Methods_Static {
	
	static WebDriver driver;
	
	 public static  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutopackage A1_Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs_Methods_Static {
	
	static WebDriver driver;
	
	 public static  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			Property("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
		 
	 }
	 
	 public static void OpenOrgangeHRM()throws Exception
	 {
			driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
	 
	 public static void Login()throws Exception
	 {
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
		 
	 }
	 
	 public static void Add_Jobs()throws Exception
	 {
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales23");
			findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales23 desr");
			findElement(By.id("jobTitle_note")).sendKeys("Sales23 Note");
			findElement(By.id("btnSave")).click();
	 }
	 
	 public static void CloseBrowser()throws Exception
	 {
		 driver.quit();
	 }
	 
  
  
  
  
}
