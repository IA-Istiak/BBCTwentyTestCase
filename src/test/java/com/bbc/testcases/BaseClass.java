package com.bbc.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.bbc.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();

	public static WebDriver driver;
	public static Logger logger;


	@BeforeClass
	public void setup() {

		// launch browser
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}
		
		  driver.manage().window().maximize();
		
		//Implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//for logging
				logger = LogManager.getLogger("BBC20TestCasev1");
				
				//open url
				driver.get(url);
				logger.info("url opened");
		
	}
	
	@AfterClass
	 public void tearDown() {
		 driver.close();
		 driver.quit();
	 }
	
}