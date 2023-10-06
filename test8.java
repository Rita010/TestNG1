package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test8 {
	

	// Hardassertion and soft assertion
	
	WebDriver driver;

	@Test
	public void TestCaseOne() {
		
		// Hardassertion
		
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com");
	
		// verify title
	
	String actualtitle = driver.getTitle();
	Assert.assertEquals(actualtitle, "webdriveruniversity.com");
		
		// verify url
	boolean avail = driver.getCurrentUrl().contains("more");
	Assert.assertTrue(avail);
	
	// verify element displayed
	
	boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
	Assert.assertTrue(avail2);
	driver.close();
		
	}	
	
	@Test
	public void testCaseTwo() {
		
		// soft assertion
		
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com");
		
		SoftAssert ss = new SoftAssert();
		
		// verify title
		
		String actualtitle = driver.getTitle();
		ss.assertEquals(actualtitle, "WebDriverUniversity.com");
		
		// verify url
		
		boolean avail = driver.getCurrentUrl().contains("more");
		ss.assertTrue(avail);
		
		// verify element displayed
		
		boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		ss.assertTrue(avail2);
		driver.close();
		ss.assertAll();
	
		
		// fail - any assertion is fail
		// pass - if any assertion is pass
	}
	
	
	
	
	
}
