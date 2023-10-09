package sep11;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Apputil1;

public class SecondtestNGclass extends Apputil1{
	@Test (enabled= true,priority=0,invocationCount = 2)
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("46892");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("34632");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String adres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(adres+"     "+"Executing addition test",true);
		}
	@Test(description = "Validate division")
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys("264892");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("632");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String divres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(divres+"     "+"Executing division test",true);	
	}
	@Test()
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("546892");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("632");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String multires = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(multires+"     "+"Executing multiplication test",true);
	}

}
