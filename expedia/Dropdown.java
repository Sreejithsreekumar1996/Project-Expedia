package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown {
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
		
		
		//dropdown menu popup opening0
		driver.findElement(By.xpath("//*[@id=\"primary-navigation\"]/div/button")).click();
	//dropdown option not showing while automated testing
		
}
}