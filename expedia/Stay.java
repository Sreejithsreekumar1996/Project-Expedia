package expedia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Stay {

	ChromeDriver driver;
	
	@BeforeTest
	public void step() {
    driver = new ChromeDriver();
  //url loading
    driver.get("https://www.expedia.co.in");
	}
	@Test
	public void stay () throws InterruptedException {
		// maximize the screen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Destination
		driver.findElement(By.xpath(" //*[@class='uitk-fake-input uitk-form-field-trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='location-field-destination']")).sendKeys("goa");
		driver.findElement(By.xpath("//*[@id='location-field-destination-menu']/div[2]/div[2]/ul/li[1]/button")).click();
		driver.findElement(By.xpath(" //*[@id='location-field-destination']")).click();
		Thread.sleep(3500);
	
		//check in date selection
		//date picker click

		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		while(true)
		{
		WebElement month = driver.findElement(By.xpath("//*[@class='uitk-date-picker-month-name uitk-type-medium']/div/h2"));
		 if(month.equals("January 2023"))
		 {
		 System.out.println("month1");
		break;
		}
		 else
			driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
		}
	//Day selection 
		List<WebElement> alldates1=driver.findElements(By.xpath("//*[@class='uitk-calendar'] /div[2]/div[1]/table/tbody/tr[4]/td[6]/button"));
		for (WebElement dateelement:alldates1);
		{
	//		String date=dateelement.getAttribute("data-day");
	//(date.equals("25"))
	//		{
	//			System.out.println(date);
		//		dateelement.click();
				System.out.println("date selected");
			}
		//checkout date 
			driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
			while(true)
			{
			WebElement month = driver.findElement(By.xpath("//*[@class='uitk-date-picker-month-name uitk-type-medium']/div/h2"));
			 if(month.equals("January 2023"))
			 {
			 System.out.println("month1");
			break;
			}
			 else
				driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
			}
		//Day selection 
			List<WebElement> alldates2=driver.findElements(By.xpath("//*[@class='uitk-calendar'] /div[2]/div[1]/table/tbody/tr[4]/td[6]/button"));
			for (WebElement dateelement:alldates1);
			{
//				String date=dateelement.getAttribute("data-day");
//				if(date.equals("27"))
				{
//					System.out.println(date);
//					dateelement.click();
					System.out.println("date selected");
		
				}
				//done button click
		driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();
			}
		//travelers details
			driver.findElement(By.xpath("//*[@cl  s='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();
			//Room(adults + or -)
			driver.findElement(By.xpath("//*[@class='uitk-layout-flex-item uitk-step-input-touch-target']")).click();
			//
	}
}
	
	