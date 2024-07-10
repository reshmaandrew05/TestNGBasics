package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	WebDriver driver;
	@BeforeMethod
	public void search()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "Searchitem",dataProviderClass = DataProviders.class)//took data from data provider class
	public void seacrhItem(String product)
	{
		WebElement searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchbox.sendKeys(product);
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.click();
	}
	@Test(dataProvider = "credentials",dataProviderClass = DataProviders.class)//took data from data provider class
	public void fbLogin(String username, String Password)
	{
		System.out.println(username);
		System.out.println(Password);
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	

}
