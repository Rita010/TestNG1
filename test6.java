package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test6 {
	
WebDriver driver;

@Test
public void Test1() {
	//javascript executor to click on element
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com");
	//driver.findElement(By.id("contact-us")).click();	
	WebElement contactUsLink = driver.findElement(By.id("contact-us"));
	JavascriptExecutor je = (JavascriptExecutor)driver;
	je.executeScript("arguments[0].click", contactUsLink);
	driver.close();
	
}
@Test
public void Test2()throws InterruptedException{
	// JavaScript executor to click on element
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com");
	// driver.findElement(By.id("contact-us")).click();
	
	WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
	JavascriptExecutor je = (JavascriptExecutor)driver;
	je.executeScript("arguments[0].scrollIntoView,(true)",scrollElement);
	Thread.sleep(5000);
	driver.close();
	
	

	// set up new attribute for element
	// <h1 id = "hello">Hello</h1>
	
}
@Test
public void Test3()throws InterruptedException {
	// JavaScript executor to click on element
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com");
	//driver.findElement(By.id("contact-us")).click();	
	WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
	JavascriptExecutor je =(JavascriptExecutor)driver;
	je.executeScript("arguments[0].setAttribute('data-cy','two')",scrollElement);		
	String attributeValue = scrollElement.getAttribute("data-cy"); // two
	System.out.println(attributeValue);
	//driver.close();
}
@Test
public void Test4()throws InterruptedException{
		// JavaScript executor to click on element
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com");
		//driver.findElement(By.id("contact-us")).click();	
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
		String Title = (String)je.executeScript("return document.title");
		// First parameter of  JavascriptExecutor is script
		Assert.assertEquals(Title,"WebDriverUniversity.com");
		driver.close();
}
@Test
public void Test5()throws InterruptedException{
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/Actions/index.html");
	Actions ac = new Actions(driver);
	WebElement el = driver.findElement(By.id("double-click"));
	ac.doubleClick(el).build().perform();
	String className = el.getAttribute("class");
	Assert.assertEquals(className, "div-double-click double");
	driver.close();
	
}
@Test
public void Test6() throws InterruptedException {
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/Actions/index.html");
	
	Actions ac = new Actions(driver);
	WebElement draggable = driver.findElement(By.id("draggable"));
	WebElement droppable = driver.findElement(By.id("droppable"));
	ac.dragAndDrop(draggable, droppable).build().perform();
	Assert.assertEquals(droppable.getText(), "Dropped!");
	driver.close();
	
	
	// click and hold
	
}
@Test
public void Test7() {
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/Actions/index.html");
	Actions ac = new Actions(driver);
	WebElement clickable = driver.findElement(By.id("click-box"));
	ac.clickAndHold(clickable).build().perform();
	Assert.assertEquals(clickable.getText(), "Well done! keep holding that click now.....");
	driver.close();
	
}
@Test
public void Test8()throws InterruptedException {
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/Actions/index.html");
	Actions ac = new Actions(driver);
	WebElement e = driver.findElement(By.cssSelector("#double-click"));
	ac.contextClick(e).build().perform();
	Thread.sleep(5000);
	driver.close();
	
}
@Test
public void TestCase9() {
	
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/Actions/index.html");
	Actions ac = new Actions(driver);
	WebElement e = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
	ac.moveToElement(e).build().perform();
	WebElement e2 = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
	Assert.assertEquals(true, e2.isDisplayed());
}






	
}

	


	











