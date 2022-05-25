package Selenium_prjct;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narasima\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions a = new Actions(driver);
		a.moveToElement(Jobs).build().perform();
		driver.findElement(By.xpath("//a[text()='IT jobs']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window is" + ParentWindow);
		
	    Set<String> all_Id = driver.getWindowHandles();
	    for (String ID : all_Id) {
	    	String title = driver.switchTo().window(ID).getTitle();
	    	System.out.println(title);
	    }
	    	
	    
	    		}  	
	}