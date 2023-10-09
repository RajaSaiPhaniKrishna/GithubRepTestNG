package sep11;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Apputil;

public class FirsttestNGclass extends Apputil{

@Test
public static void branches()
{
driver.findElement(By.xpath("(//img)[5]")).click();
Reporter.log("Executing branches test",true);
}
@Test
public void roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing Roles test",true);
	}
@Test
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing users test",true);
}
}
