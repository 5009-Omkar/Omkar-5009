package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Users\\RUTUJA\\Desktop\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(10000);
		driver.get("https://www.spicejet.com/" );
		
		Thread.sleep(9000);
		//driver.findElement(By.name("q")).sendKeys("testing");
		
	//	driver.close();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][1]")).click();
		Thread.sleep(10000);
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateval = "20-2-2020";
		
		
cal(driver , date, dateval);

	 
	

	}
	public static void cal (WebDriver driver, WebElement element ,String dateval)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
	}
}
