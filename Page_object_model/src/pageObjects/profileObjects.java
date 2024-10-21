package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class profileObjects {
	
	public static WebElement profile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a"));
	}
    public static WebElement city(WebDriver driver) {
    	return driver.findElement(By.id("City"));
    }
    public static WebElement pwd(WebDriver driver) {
    	return driver.findElement(By.xpath("//*[@id=\"Password\"]"));
    }
    public static WebElement update(WebDriver driver) {
    	return driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button"));
    }
}
