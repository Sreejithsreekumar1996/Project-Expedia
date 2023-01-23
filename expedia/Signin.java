package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signin {
EdgeDriver driver;
	
	@BeforeTest
	public void step() {
    driver = new EdgeDriver();
  //url loading
    driver.get("https://www.expedia.co.in");
	}
	@Test
	public void signin () throws InterruptedException {
		// maximize the screen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//signin button click
		driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/section/div/div/div[2]/div/button/div")).click();

	
	
	}
}