package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTestNG {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();		
	}
	
	@Test
	public void verifyHeaderMultipleCheckboxDemo()
	{	
		WebElement header=driver.findElement(By.xpath("//div[contains(text(),'Multiple Checkbox Demo')]"));
		String actualheader=header.getText();
		String expectedheader="Multiple Checkbox Demo";
		Assert.assertEquals(actualheader, expectedheader);
	}
	
	@Test
	public void verifyCheckboxOneisDeselected()
	{
		WebElement checkboxone=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean actualstatus=checkboxone.isSelected();
		boolean expectedstatus=false;
		Assert.assertEquals(actualstatus, expectedstatus);
		
	}
	
	@Test(dependsOnMethods = "verifyCheckboxOneisDeselected")//method given in "" should passed then only this method will run
	public void VerifyCheckboxTwoisSelected()
	{
		WebElement checkboxtwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkboxtwo.click();
		boolean actualstatustwo=checkboxtwo.isSelected();
		boolean expectedstatustwo=true;
		Assert.assertEquals(actualstatustwo, expectedstatustwo);
	}
	
	
}
