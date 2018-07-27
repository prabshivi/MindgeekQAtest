package Weather;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


@Test
public class TempCheck extends Browser {
	
	public WebDriver driver;
	public void temperature() throws IOException {
		
		//calling class for browser selection
		driver=BrowserSelection();
		 
		//javascript executor to enabling scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		//going to the website
		driver.get(" https://www.theweathernetwork.com/ca");
		 
		//geting the temperature 
		String tempinCelcius =driver.findElement(By.xpath("//div[@class='current-location-current-temp-c']")).getText();
		
		//extracting the number out of the loactor
		String Temp= tempinCelcius.replaceAll("[^0-9]", "");
	
		int Temperature =Integer.parseInt(Temp);
		
		//scrolling down to find the see news button
		js.executeScript("window.scrollBy(0,1500)");
		
		
		//click operation
		driver.findElement(By.xpath("//a[contains(text(),'See All News')]")).click();
		
		//providing time to load
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		if (Temperature>=15) {
			
			System.out.println("Test Passed");// chcecking if the temperature is greater than 15
			}
		else 
			System.out.println("Test Failed");
		
		
		//checking if the element clicked is correct 
		String StringcheckLatest=driver.findElement(By.xpath("//div[@id='category-subnav']//ul[@class='tab clearfix']//li[1]")).getText();
		
		System.out.println(StringcheckLatest);
		
		if(StringcheckLatest.equals("Latest")) {
			System.out.println("The button you pressed is Latest news");
		}
		else
			System.out.println("The button pressed is something else");
		
		//getting the CSS to check if the text is underlined
		String cssvalue=driver.findElement(By.xpath("//div[@id='category-subnav']//ul[@class='tab clearfix']//li[1]")).getCssValue("color");
		
		System.out.println(cssvalue);
		
		//clicking world button 
		driver.findElement(By.xpath("//a[@href='/news/category/world/']")).click();
		
		
		String StringcheckWorld=driver.findElement(By.xpath("//a[@href='/news/category/world/']")).getText();
		
		if(StringcheckWorld.equals("World")) {
			System.out.println("The button you pressed is World news");
		}
		else
			System.out.println("The button pressed is something else");
		
		
	}

}