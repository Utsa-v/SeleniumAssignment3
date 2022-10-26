package Assignment3;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question3 {
	public WebDriver driver;
	@BeforeClass()
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Utsav Sharma\\eclipse-workspace\\SeleniumAssignment3\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.path2usa.com/travel-companion/");
	}
	@Test(priority=1)
	public void check() {
		driver.findElement(By.id("form-field-travel_from")).sendKeys("Delhi");
		driver.findElement(By.id("form-field-travel_to")).sendKeys("Chicago");
//		List <WebElement> travel = driver.findElements(By.xpath("(//input[@class=\"elementor-field elementor-size-sm elementor-field-textual ui-autocomplete-input\"])[2]"));
//		for(WebElement e: travel) {
//			System.out.println(e.getSize());
//		}
		
	}
	@Test(priority=2)
	public void clicked() {
		WebElement datecheck =driver.findElement(By.xpath("//div//input[@id=\"form-field-travel_comp_date\"]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(datecheck).click().build().perform();
		datecheck.click();
	}

	
}
