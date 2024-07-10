package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class RadiobuttonTestng {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();		
	}
	

	
	@Test
	public void verifyShowSelectedButtonisEnabled()
	{	
		WebElement showselectedbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean actualstatus=showselectedbutton.isEnabled();
		boolean expectedstatus=true;
		Assert.assertEquals(actualstatus, expectedstatus);
	}
	
	@Test(priority=1,enabled=false)//priority assigned, enabled=false skips the particular test case
	public void verifyMaleRadioButtonisEnabled()
	{
		WebElement maleradio=driver.findElement(By.xpath("//input[@value='Male']"));
		maleradio.click();
		boolean actualstatus=maleradio.isSelected();
		boolean expectedstatus=true;
		Assert.assertEquals(actualstatus, expectedstatus);
	}

	
}
	