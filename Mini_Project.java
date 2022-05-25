package Selenium_prjct;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Mini_Project {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narasima\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sarath@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("sarath123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(Dresses).build().perform();
		WebElement EveningDresses = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		a.click(EveningDresses).build().perform();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		WebElement Pink = driver.findElement(By.xpath("//a[@title='Printed Dress']"));
		a.doubleClick(Pink).build().perform();
		driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File Location = new File("C:\\Users\\Narasima\\eclipse-workspace\\Selenium_Project\\Screenshot\\miniproject.png");
		FileHandler.copy(screenshotAs, Location);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}

}
