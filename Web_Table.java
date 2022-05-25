package Selenium_prjct;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Web_Table {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narasima\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement webElement : alldata) {
			String text = webElement.getText();
			System.out.println(text);
				
		}
		List<WebElement> Row_Data = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement webElement1 : Row_Data) {
			String text = webElement1.getText();
			System.out.println(text);
		}
			
		List<WebElement> Column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[8]"));
		for (WebElement webElement2 : Column_Data) {
			String text = webElement2.getText();
			System.out.println(text);
			
		}
		WebElement Particular_Data = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		String text = Particular_Data.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/input")).click();
		driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]/input")).click();
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]/input")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]/input")).click();
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[3]/input")).click();
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File screenshotAs = tc.getScreenshotAs(OutputType.FILE);
		File Location = new File("C:\\Users\\Narasima\\eclipse-workspace\\Selenium_Project\\Screenshot\\webtable.png");
		FileHandler.copy(screenshotAs, Location);
		
		
		
	}

}
