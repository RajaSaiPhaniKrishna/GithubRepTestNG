package sep15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register_Opencart {
Properties   conpro;
WebDriver driver;
@BeforeTest
public void setup() throws Throwable, Throwable
{
	conpro = new Properties();
	//load file
	conpro.load(new FileInputStream("login.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(conpro.getProperty("url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void start_test() throws Throwable
{
JavascriptExecutor js = (JavascriptExecutor) driver;	
driver.findElement(By.xpath(conpro.getProperty("objmyaccount"))).click();
driver.findElement(By.xpath(conpro.getProperty("objregister"))).click();
driver.findElement(By.xpath(conpro.getProperty("objfname"))).sendKeys(conpro.getProperty("Enterfname"));
driver.findElement(By.xpath(conpro.getProperty("objlname"))).sendKeys(conpro.getProperty("Enterlname"));
driver.findElement(By.xpath(conpro.getProperty("objemail"))).sendKeys(conpro.getProperty("Enteremail"));
driver.findElement(By.xpath(conpro.getProperty("objpassword"))).sendKeys(conpro.getProperty("Enterpass"));
js.executeScript("window.scrollBy(0,300)");
js.executeScript("document.querySelector(\"input[value='1'][name='newsletter']\").click()");
Thread.sleep(2000);
js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
Thread.sleep(2000);
js.executeScript("document.querySelector(\"button[type='submit']\").click()");
}
@AfterTest
public void teardown() throws Throwable
{
	Thread.sleep(8000);
	driver.quit();
}
}
