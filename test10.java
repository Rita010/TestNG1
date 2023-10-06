package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test10 {

	WebDriver driver;

	@Parameters({ "username", "password" })
	@Test
	public void TestCase1(String un, String pwd) {
		System.out.println("Test case one");

		System.setProperty("webdiver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		driver.close();

	}

	@Parameters({ "username", "password" })
	@Test
	public void TestCase2(String un, String pwd) {
		System.out.println("Test case two");

		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		driver.close();

	}

	@Parameters({ "username", "password" })
	@Test
	public void TestCase3(String un, String pwd) {
		System.out.println("Test case three");

		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		driver.close();

	}
	@Parameters({"username","password"})
	@Test
	public void TestCase4(String un, String pwd) {
	System.out.println("Test case four");	
		
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");	
		
	driver.findElement(By.id("user-name")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("login-button")).click();
	boolean avail = driver.getCurrentUrl().contains("inventory");
	Assert.assertTrue(avail);
	driver.close();	
		
	
	}
	
	
	
}
