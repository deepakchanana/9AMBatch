package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init() throws IOException
	{
  File f=new File("D:\\DCSessions9PM\\YTFramework\\object_repository.properties");
  FileInputStream fi=new FileInputStream(f);
  pr=new Properties();
  pr.load(fi);
		
		
		//Browser launch + url hit
	}
	
	@AfterMethod
	public void bclose()
	{
		// browser close
	}

}
