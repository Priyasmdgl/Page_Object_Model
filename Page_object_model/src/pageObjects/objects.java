package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objects {
	
public static WebElement email(WebDriver driver) {
	return driver.findElement(By.id("email"));
}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.id("password"));
	
}
public static WebElement login(WebDriver driver) {
	return driver.findElement(By.id("submitBTN"));
}
}
