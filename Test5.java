package testng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com");
		
	}
	@Test(priority =1, description = "login funcionality")
	public void testOne() {
		String title = driver.getTitle();
		String expectedTitle ="WebDriverUniversity.com";
		
		Assert.assertEquals(title, expectedTitle);
	}
	
	@Test(priority = 2, description = "validate the home page url")
	public void testTwo() {
		String url = driver.getCurrentUrl();
		boolean expected = url.contains("webdriveruniversity");
		Assert.assertEquals(expected, true);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
}
