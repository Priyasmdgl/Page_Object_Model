package php_Site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.objects;
import pageObjects.profileObjects;

public class profilePage {
    @Test
	public void profile_Page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		objects.email(driver).sendKeys("user@phptravels.com");
		objects.password(driver).sendKeys("demouser");
		objects.login(driver).click();
		Thread.sleep(3000);
		profileObjects.profile(driver).click();
		profileObjects.city(driver).clear();
		profileObjects.city(driver).sendKeys("Bangalore");
		profileObjects.pwd(driver).sendKeys("demouser");
		profileObjects.update(driver).click();
		
	/*	WebElement profile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a"));
		profile.click();
		
		WebElement city = driver.findElement(By.id("City"));
		city.clear();
		city.sendKeys("Chennai");
		
		WebElement update = driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button"));
		update.click();*/
		driver.quit();
	}
    
}
