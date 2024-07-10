package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();//system.setproperty equivalent to this line.
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyTitle()
	{
		String actualtitle=driver.getTitle();
		String Expected=("reshma"+actualtitle);
		//Assert.assertEquals(actualtitle, Expected);
		Assert.assertEquals( actualtitle,Expected);//if condition checking statement in testNG
	}
	@Test
	public void verifyShowMessage()
	{
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualButton=button.getText();
		System.out.println(actualButton);
		String expectedButton="Show Message";
		Assert.assertEquals(actualButton, expectedButton);
	
		
		
	}
	@Test(invocationCount =3)
	public void verifyWhetherShowMessageButtonEnabled()
	{
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean status=button.isEnabled();
		//Assert.assertEquals(status, true);
		Assert.assertTrue(status); //boolean assert code written like this
	}
	
	

}
