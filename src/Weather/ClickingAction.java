/*package Weather;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class ClickingAction extends Browser  {

	public WebDriver driver;
	@Test
	public WebDriver  Allnews(WebDriver driver) throws IOException  {
		
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.manage().window().maximize();
	
	js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.xpath("//a[contains(text(),'See All News')]")).click();
	
	//wait for the page to load 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return WebDriver;
	
	}
	
}
*/