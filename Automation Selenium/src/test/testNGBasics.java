package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGBasics {
	
	WebDriver driver;
	

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\\Users\\RUTUJA\\Desktop\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
		Thread.sleep(10000);
		driver.get("https://www.spicejet.com/" );
	}
	
	
@Test
	public void googlelogo()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}




@AfterMethod
public void teardown()
{
	driver.quit();
}
}


