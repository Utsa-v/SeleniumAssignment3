package Assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question1 {
	public WebDriver driver;
	@BeforeClass()
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Utsav Sharma\\eclipse-workspace\\SeleniumAssignment3\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test(priority=1)
	public void details() {
	driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Utsav");
	driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Sharma");
    driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("KO-01 1602 Klassic Heights sector134 Noida");
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("utsav.sharma@tothenew.com");
	driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9667348333");
	driver.findElement(By.id("firstpassword")).sendKeys("tothenew@123");
	driver.findElement(By.id("secondpassword")).sendKeys("tothenew@123");
}
@Test(priority=2)
public void radiocheck() {
	driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();// male click 
	driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();// female click male disabled
	// for check box
	// use loop to select all the check-boxes 
	List <WebElement> list = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	System.out.println(list.size());
	for(int i=0; i<list.size(); i++) {
		WebElement element = list.get(i);
		element.click();
	}
}
@Test(priority=3)
public void dropcheck() {
	// facing issue in language may be the issue in site because i tried Action class click() and sendKeys(Keys.ENTER)
//	List <WebElement> language = driver.findElements(By.xpath("//li[@class=\"ng-scope\"]"));
//	System.out.println(language.size());
//	for(int i=0; i<language.size(); i++) {
//		WebElement element = language.get(i);
//	}
	
	WebElement dropDownElement = driver.findElement(By.id("Skills"));
	Select dropdown = new Select(dropDownElement);
	dropdown.selectByValue("Adobe InDesign");
	
driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
WebElement element =driver.findElement(By.xpath("//input[@type=\"search\"]"));
element.sendKeys("Australia");
element.sendKeys(Keys.ENTER);

WebElement drop = driver.findElement(By.id("yearbox"));
Select down = new Select(drop);
down.selectByValue("1918");

WebElement drop1 = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
Select down1 = new Select(drop1);
down1.selectByValue("January");

WebElement drop2 = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
Select down2 = new Select(drop2);
down2.selectByValue("2");	
}
@Test(priority=4)
public void submitcheck() {
	WebElement sub= driver.findElement(By.id("submitbtn"));
	boolean b =sub.isEnabled();
	sub.click();
	System.out.println(b);
}
@AfterClass
public void afterclass() {
	driver.close();
}

}
