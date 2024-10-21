package php_Site;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.objects;

public class loginPage {
    @Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		objects.email(driver).sendKeys("user@phptravels.com");
		objects.password(driver).sendKeys("demouser");
		objects.login(driver).click();
		
		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("user@phptravels.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.id("submitBTN"));
		login.click();*/
		driver.quit();
	}
}
