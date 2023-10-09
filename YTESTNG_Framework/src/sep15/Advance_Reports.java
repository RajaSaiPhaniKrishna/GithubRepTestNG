package sep15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_Reports {
WebDriver driver;
ExtentReports reports ;
ExtentTest logger;
@BeforeTest
public void Generatereport()
{
	//define path of html
	reports = new ExtentReports("./test-output/Reports/Demo.html");
	}
@BeforeMethod
public void setup()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	}
@Test
public void testpass()
{
//test case starts here
	logger = reports.startTest("pass test case");
	logger.assignAuthor("Phani");
	logger.assignCategory("Functional");
	String Expected_title = "Google";
	String Actual_title = driver.getTitle();
	if(Expected_title.equalsIgnoreCase(Actual_title))
	{
		logger.log(LogStatus.PASS,Expected_title+"  "+ Actual_title+"   "+"Title is Matching");
		}
	else
	{
		logger.log(LogStatus.FAIL,Expected_title+"  "+ Actual_title+"   "+"Title is not Matching");
	}
}
@Test
public void testfatal()
{
//test case starts here
	logger = reports.startTest("fail test case");
	logger.assignAuthor("Phani");
	logger.assignCategory("Functional");
	String Expected_title = "email";
	String Actual_title = driver.getTitle();
	if(Expected_title.equalsIgnoreCase(Actual_title))
	{
		logger.log(LogStatus.PASS,Expected_title+"  "+ Actual_title+"   "+"Title is Matching");
		}
	else
	{
		logger.log(LogStatus.FAIL,Expected_title+"  "+ Actual_title+"   "+"Title is not Matching");
	}
}
@AfterMethod
public void teardown()
{
	reports.endTest(logger);
	reports.flush();
	driver.quit();
}

}

