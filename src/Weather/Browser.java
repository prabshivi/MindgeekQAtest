package Weather;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


//Browser selection done just for FIREFOX and GOOGLE CHROME can be done for any browser 
public class Browser {		
		//Properties file to change the parameters 
	
	
	
	public WebDriver driver;
	
	
	public WebDriver BrowserSelection() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/shivi/eclipse-workspace/MindgeekQADeveloperTest/Properties");

		prop.load(fis);
		
		if (prop.getProperty("browser").equals("firefox")) {
		
			 driver= new FirefoxDriver();
		}
	
		else if(prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/Users/shivi/downloads/chromedriver");
			driver= new ChromeDriver();
			
			}
			
		//Providing a wait time to check everything loads
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
	}

	
	
	

}
