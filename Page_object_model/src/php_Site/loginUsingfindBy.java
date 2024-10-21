package php_Site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.findBy;

public class loginUsingfindBy {
	@Test
	public void test() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	PageFactory.initElements(driver,findBy.class);
	findBy.email.sendKeys("user@phptravels.com");
	findBy.password.sendKeys("demouser");
	findBy.login.click();
	driver.quit();
	}
}
