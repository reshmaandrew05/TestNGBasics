package assiegnmentWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWork {
	
	WebDriver driver;
	
	@BeforeMethod
	public void urlLaunch() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/form-submit.php");
	driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "details",dataProviderClass = DataProviders.class)
	public void details(String fn, String ln, String un, String city, String state, String Zp)
	{
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstname.sendKeys(fn);
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lastname.sendKeys(ln);
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(un);
		WebElement ciy=driver.findElement(By.xpath("//input[@placeholder='City']"));
		ciy.sendKeys(city);
		WebElement st=driver.findElement(By.xpath("//input[@placeholder='State']"));
		st.sendKeys(state);
		WebElement code=driver.findElement(By.xpath("//input[@placeholder='Zip']"));
		code.sendKeys(Zp);
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		checkbox.click();
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}
	

}
