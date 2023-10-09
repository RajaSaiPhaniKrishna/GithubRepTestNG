package sep11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.Apputil2;

public class ThirdtestNGclass extends Apputil2{
@Test
public void personalbanking()
{
driver.findElement(By.xpath("(//img)[4]")).click();	
}
@Test
public void corporatebanking()
{
driver.findElement(By.xpath("(//img)[5]")).click();	
}
@Test
public void internationalbanking()
{
driver.findElement(By.xpath("(//img)[6]")).click();	
}
}
