package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flight {
EdgeDriver driver;
	
	@BeforeTest
	public void step() {
    driver = new EdgeDriver();
  //url loading
    driver.get("https://www.expedia.co.in");
	}
	@Test
	public void stay () throws InterruptedException {
		// maximize the screen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//flight option click
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a")).click();
		//Return option  leaving from selection
		Thread.sleep(2500);

		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).sendKeys("cochin");
		Thread.sleep(3000);
		//while location given the location search won't come on dropdown 
		//Destination
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]")).sendKeys("goa");
		Thread.sleep(3000);
		//while location given the location search won't come on dropdown 
		
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[5]/button")).sendKeys("27");
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[5]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();
		
		//return date selection
		driver.findElement(By.xpath("//*[@id=\"d2-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[7]/button")).sendKeys("29");
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[7]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/button")).click();
		
		//travellers    dropdown
		
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/button")).click();
		Thread.sleep(2000);
		//adult adding (+)
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]")).click();
		Thread.sleep(2000);
		//adult count (-)
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[1]")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[1]")).click();
		//done button click
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		//search button click
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")).click();
		
		//result error shows(due to location to showing at automation testing)
	
	}
}
