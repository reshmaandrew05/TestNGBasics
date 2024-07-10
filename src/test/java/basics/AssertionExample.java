package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
WebDriver driver;
SoftAssert asser=new SoftAssert();
	
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();		
	}
	

	
	private SoftAssert SoftAssert() {
		// TODO Auto-generated method stub
		return null;
	}



	@Test
	public void verifyJqueyHeader()
	{	
		WebElement header=driver.findElement(By.xpath("//div[contains(text(),'JQuery UI Progress bar - Download Dialog')]"));
		String actualheader=header.getText();
		System.out.println(actualheader);
		String expectedheader="JQuery UI Progress bar - Download Dialog";
		//Assert.assertEquals(actualheader, expectedheader);
		asser.assertEquals(actualheader, expectedheader);
		System.out.println("Passed or failed");//hard assert= if assert pass then only this statement work else it won't work assertion throw exception
		WebElement startbutton=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		String buttonheader=startbutton.getText();
		String expectedbutton="Start Download";
		asser.assertEquals(buttonheader, expectedbutton);
		System.out.println(buttonheader);
		asser.assertAll();//object of softassert.assertAll()-failure test case should be shown as failure by giving this statement only else it shows as pass
		
	}
	

}
