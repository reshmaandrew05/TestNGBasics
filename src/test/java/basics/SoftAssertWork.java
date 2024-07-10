package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertWork {
	
	WebDriver driver;
	SoftAssert sassert=new SoftAssert();
	
	@BeforeMethod
	public void websiteLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyAllCheckboxesEnabled()
	{
		WebElement checkbox1=driver.findElement(By.xpath("//div[@class='form-check'][1]"));
		boolean actualstatus=checkbox1.isEnabled();
		boolean expectedstatus=true;
		sassert.assertEquals(actualstatus, expectedstatus);
		WebElement checkbox2=driver.findElement(By.xpath("//div[@class='form-check'][2]"));
		boolean actualstatus2=checkbox2.isEnabled();
		boolean expectedstatus2=true;
		sassert.assertEquals(actualstatus2, expectedstatus2);
		WebElement checkbox3=driver.findElement(By.xpath("//div[@class='form-check'][3]"));
		boolean actualstatus3=checkbox3.isEnabled();
		boolean expectedstatus3=true;
		sassert.assertEquals(actualstatus3, expectedstatus3);
		WebElement checkbox4=driver.findElement(By.xpath("//div[@class='form-check'][4]"));
		boolean actualstatus4=checkbox4.isEnabled();
		boolean expectedstatus4=true;
		sassert.assertEquals(actualstatus4, expectedstatus4);
		WebElement checkbox5=driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean actualstatus5=checkbox5.isEnabled();
		boolean expectedstatus5=true;
		sassert.assertEquals(actualstatus5, expectedstatus5);
		sassert.assertAll();
	}
	

}
