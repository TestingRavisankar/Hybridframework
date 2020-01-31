package com.inetbank.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbank.utilities.Readconfig;

public class BaseClass {

	Readconfig Rc = new Readconfig();
		
	public String baseURL= Rc.getApplicationURL();
	public String username=Rc.getusername();
	public String password=Rc.getpassword();
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String browser)
	{
		//logger=Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("log4j.properties");
		
		if (browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",Rc.getchromedriverpath());
				System.out.println(Rc.getchromedriverpath());
				//System.out.println("Path :"+ Rc.getchromedriverpath());
				//System.setProperty("webdriver.chrome.driver","G://Raviproj//Hybridframework//Drivers//chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
		else if (browser.equals("firefox"))
			{
			System.setProperty("webdriver.gecko.driver",Rc.getfirfoxdriverpath());
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			}
		
		else if (browser.equals("InternetExplorer"))
		{
		System.setProperty("webdriver.ie.driver",Rc.getIEdriverpath());
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		}
			
			driver.get(baseURL);
		}
	
	@AfterClass
	
	public void teardown()
	{
		driver.quit();
	}
		
	
}
