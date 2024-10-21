package php_Site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class withoutFindBy {
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		PageFactory.initElements(driver, withoutFindBy.class);
		Thread.sleep(3000);
		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		submitBTN.click();
		driver.quit();
	}

}
