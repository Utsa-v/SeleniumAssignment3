package Assignment3;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question2 {
	public WebDriver driver;

	@BeforeClass()
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Utsav Sharma\\eclipse-workspace\\SeleniumAssignment3\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tothenew.com/");
	}

	@Test(priority = 1)
	public void navabr() throws InterruptedException {
		
	WebElement text = driver.findElement(By.xpath("(//a[@id=\"h-Services\"])[2]"));
	Actions action = new Actions(driver);
	action.moveToElement(text).perform();
	System.out.println("Action Performed");
	Thread.sleep(2000);
	List <WebElement> list = driver.findElements(By.xpath("(//li[@class=\"menu-item menu-expanded\"]//ul)[3]//li//a"));
   for(int i=0; i<list.size(); i++) {
			WebElement e = list.get(i);
			System.out.println(e.getText());
			
		}
 
		
	}
}
