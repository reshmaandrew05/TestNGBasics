package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {
	
	WebDriver driver;
	SoftAssert asser=new SoftAssert();
		
		@BeforeMethod
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://selenium.qabible.in/table-pagination.php");
			driver.manage().window().maximize();		
		}
		@Test
		public void verifyTableHeader()
		{	
			WebElement header=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
			String actualheader=header.getText();
			System.out.println(actualheader);
			WebElement header1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[6]"));
			String actualheader1=header1.getText();
			System.out.println(actualheader1);
			
			
		}
		
		@Test
		public void printTableHeader()
		{
			List<WebElement> headerprint=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
			int listsize=headerprint.size();
			System.out.println(listsize);
			
			for(WebElement element:headerprint)
			{
				String ele=element.getText();
				System.out.println(ele);
			}
		}
		
		@Test
		public void tableBodyPrint()
		{
			WebElement tablebody=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[1]"));
			String tablecon=tablebody.getText();
			System.out.println(tablecon);
			WebElement tablebody1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[5]"));
			String tablecon1=tablebody1.getText();
			System.out.println(tablecon1);
			
		}
		@Test
		
		public void printNames()
		{
			List<WebElement> names=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));//Data in table row print syntax
			int listsize=names.size();
			System.out.println(listsize);
			for(int i=0; i<listsize; i++)
			{
				String data=names.get(i).getText();
				System.out.println(data);
				
				
			}
			List<WebElement> details=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));//Data in table column print syntax
			int listsze=details.size();
			System.out.println(listsze);
			System.out.println("Person details");
			for(int i=0; i<listsze; i++)
			{
				String datas=details.get(i).getText();
				System.out.println(datas);
				
				
			}
			
			
		}


}
