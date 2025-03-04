package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page_Objects.Login_PageObjects;

public class Login_Page {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Boopalan\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		//Login_PageObjects loginpageobjects  = new Login_PageObjects(); 
		//made all the methods in page object as static so we dont need to create the object here.
		PageFactory.initElements(driver, Login_PageObjects.class);
		Login_PageObjects.username.sendKeys("Admin");
		Login_PageObjects.password.sendKeys(" admin123");
		Login_PageObjects.loginbutton.click();
		//		Login_PageObjects.username(driver).sendKeys("Admin");
		//		Login_PageObjects.password(driver).sendKeys("admin123");
		//		Login_PageObjects.loginbutton(driver).click();
		//driver.close();

	}

}
