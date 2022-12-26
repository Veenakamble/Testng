package flightregister;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class propertyfile {
	public Properties p;
		WebDriver driver;
		@BeforeTest
		public void setUp() throws Throwable
		{
			p=new Properties();
			p.load(new FileInputStream("E:\\automation_class\\TestNG\\src\\config\\Flight.properties"));
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@Test
	public void validateregister()
	{
			driver.findElement(By.xpath(p.getProperty("ObjReg"))).click();
			driver.findElement(By.xpath(p.getProperty("ObjName"))).sendKeys(p.getProperty("ObjEntername"));
			driver.findElement(By.xpath(p.getProperty("ObjContact"))).sendKeys(p.getProperty("ObjEntercont"));
			driver.findElement(By.xpath(p.getProperty("ObjEmail"))).sendKeys(p.getProperty("ObjEntermail"));
			driver.findElement(By.xpath(p.getProperty("ObjPass"))).sendKeys(p.getProperty("ObjEnterpass"));
			new Select(driver.findElement(By.xpath(p.getProperty("ObjGender")))).selectByVisibleText(p.getProperty("ObjSelectgender"));
			driver.findElement(By.xpath(p.getProperty("ObjBirth"))).click();
			driver.findElement(By.xpath(p.getProperty("ObjDate"))).click();
			driver.findElement(By.xpath(p.getProperty("ObjCheckbox"))).click();
			driver.findElement(By.xpath(p.getProperty("ObjRegister"))).click();
	}
		@AfterTest
		public void tearDown()
		{
			driver.close();
			
		}
		
		
	

}
