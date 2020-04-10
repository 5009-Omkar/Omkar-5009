package seleniumprograms;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class testGooglePage {
		
		WebDriver driver;
		
@BeforeTest
		public void setup() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","\\Users\\RUTUJA\\Desktop\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			Thread.sleep(10000);
			driver.get("https://www.google.com/" );
		}
		
	}


