package sep14;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assert_Equals {
	WebDriver driver;
	@Test
	public void starttest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String expected = "gmail";
		String actual = driver.getTitle();
		try {
Assert.assertEquals(actual, expected,"Title is not matching");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		driver.quit();
	}
	

}
