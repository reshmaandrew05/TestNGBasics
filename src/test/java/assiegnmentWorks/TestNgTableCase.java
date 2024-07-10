package assiegnmentWorks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTableCase {
	
	WebDriver driver;
	SoftAssert ass=new SoftAssert();
	
	@BeforeMethod
	public void urlLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifySalary()
	{
		WebElement ashtonsalary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td[6]"));
		String actualSalary=ashtonsalary.getText();
		System.out.println("Actual Salary:"+actualSalary);
		String expectedSalary="$86,000";
		System.out.println("Expected Salary"+expectedSalary);
		ass.assertEquals(actualSalary, expectedSalary);
		ass.assertAll();
		
	}
	@Test
	
	public void verifyAllNames()
	{
		List <WebElement> names=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		int size=names.size();
		System.out.println(size);
		System.out.println("Names are:");
		for(WebElement  i: names)
		{
			String name=i.getText();
			
			System.out.println(name);
		}
	}
	

}
