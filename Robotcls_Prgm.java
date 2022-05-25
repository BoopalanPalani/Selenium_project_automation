package Selenium_prjct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotcls_Prgm {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narasima\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		WebElement BestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers'][1]"));
		Actions a = new Actions(driver);
		a.contextClick(BestSellers).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles'][1]"));
		a.moveToElement(Mobiles).build().perform();
		a.contextClick(Mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Customer_Service = driver.findElement(By.xpath("//a[text()='Customer Service'][1]"));
		a.moveToElement(Customer_Service).build().perform();
		a.contextClick(Customer_Service).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Id of Parent Window is"  + ParentWindow);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println("ID is" + title);
			
		}
		
		
		
		
		
		
		
	}

}
