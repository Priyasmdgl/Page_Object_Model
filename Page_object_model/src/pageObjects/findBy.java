package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class findBy {
	@FindBy(id="email")
	public static WebElement email;
	@FindBy(id="password")
	public static WebElement password;
	@FindBy(id="submitBTN")
	public static WebElement login;

}
