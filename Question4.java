package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question4 {
	public WebDriver driver;
	@BeforeClass()
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Utsav Sharma\\eclipse-workspace\\SeleniumAssignment3\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.tothenew.com/services");
	}
	@Test(priority=1)
	public void test() {
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("window.scrollBy(0,1000)");
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		WebElement element = driver.findElement(By.xpath("//div[text()=\"Success Stories\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollTo(0,document.body.ScrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
}
