package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_PageObjects {
	//This is the detailed description for page factory
	@FindBy(how = How.NAME,using = "username")
	// This is what actually used commonly by all 
	public static WebElement username;
	@FindBy(name="password")
	public static  WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginbutton;
	
//	public static WebElement username(WebDriver driver) {
//		
//		return driver.findElement(By.name("username"));
//	}
//public static WebElement password(WebDriver driver) {
//	return driver.findElement(By.name("password"));
//	
//}
//public static WebElement loginbutton(WebDriver driver) {
//	return driver.findElement(By.xpath("//button[@type='submit']"));
//
//}
}
