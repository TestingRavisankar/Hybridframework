package com.inetbank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties prop;
	
	public Readconfig()
		{
		File src = new File("./Configurations/config.properties");
			try {
				FileInputStream fis = new FileInputStream(src);
				prop=new Properties();
				prop.load(fis);
				
			} catch (Exception e) {
				System.out.println("Exception " +e.getMessage());
			}
		}
	
	
		public String getApplicationURL()
		{
			String url = prop.getProperty("baseURL");
			return url;
		}
		
		public String getusername()
		{
			String username = prop.getProperty("username");
			return username;
		}
		
		public String getpassword()
		{
			String password = prop.getProperty("password");
			return password;
		}
		
		public String getchromedriverpath()
		{
			String chromepath = prop.getProperty("chromepath");
			return chromepath;
		}
		
		public String getfirfoxdriverpath()
		{
			String firefoxpath = prop.getProperty("firefoxpath");
			return firefoxpath;
		}
		public String getIEdriverpath()
		{
			String InternetExplorer = prop.getProperty("InternetExplorerpath");
			return InternetExplorer;
		}
}
