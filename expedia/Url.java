package expedia;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Url {
//driver setup
	
	static ChromeDriver driver;
	
	@BeforeTest
	public static void main(String args[]) {
	driver = new ChromeDriver();
	//url loading
	driver.get("https://www.expedia.co.in");
	// maximize the screen
	driver.manage().window().maximize();
	
	}
}
