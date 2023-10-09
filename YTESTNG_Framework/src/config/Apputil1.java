package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Apputil1 {
	public static WebDriver driver;
	@BeforeMethod
	public static void setup ()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Running Precondition",true);
		}
	@AfterMethod
	public static void teardown ()
	{
		driver.close();
		Reporter.log("Running Postcondition",true);
	}
	
	

}
