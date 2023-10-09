package sep14;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assert_true {
	WebDriver driver;
	@Test
	public void starttest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String expected = "rediff";
		String actual = driver.getTitle();
		try {
Assert.assertTrue(actual.equalsIgnoreCase(expected),"Title is not Matching");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		driver.quit();
	}
	

}








