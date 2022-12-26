package config;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Testscript1  extends Apputil1{
	@Test(priority = 2)
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("2658");
		driver.findElement(By.xpath("(//input[@title='Add (press +)'])[1]")).click();
		driver.findElement(By.name("display")).sendKeys("6581");
		driver.findElement(By.xpath("(//input[@title='Execute calculation (press =)'])[1]")).click();
		Reporter.log("Exceuting addition test",true);
	}
		@Test(priority = 0)
		public void division()
		{
			driver.findElement(By.name("display")).sendKeys("5826");
			driver.findElement(By.xpath("(//input[@title='Divide (press /)'])[1]")).click();
			driver.findElement(By.name("display")).sendKeys("65");
			driver.findElement(By.xpath("(//input[@title='Execute calculation (press =)'])[1]")).click();
			Reporter.log("Exceuting division test",true);
		}
		@Test(priority =1)
		public void multiplication()
		{
			driver.findElement(By.name("display")).sendKeys("8561");
			driver.findElement(By.xpath("(//input[@title='Multiply (press ×)'])[1]")).click();
			driver.findElement(By.name("display")).sendKeys("45632");
			driver.findElement(By.xpath("(//input[@title='Execute calculation (press =)'])[1]")).click();
			Reporter.log("Exceuting multiplication test",true);
		}
}
