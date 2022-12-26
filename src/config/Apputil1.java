package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Apputil1 {
public static WebDriver driver;
@BeforeMethod
public static void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Reporter.log("running precondition",true);
	
	}
@AfterMethod
public static void tearDown() throws Throwable
{
	Reporter.log("running postcondition",true);
Thread.sleep(1000);
	driver.close();
}
}
