package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//OBJECT REPOSITORY
	@FindBy(xpath="//input[@id='wpName1']")
	WebElement username;
	
	@FindBy(name="wpPassword")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='wpLoginAttempt']")
	WebElement Loginbtn;
	
	@FindBy(xpath = "//div[contains(text(),'Incorrect username or password entered')]")
	WebElement LoginFail;
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void Login(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
	}
	
	public void ClickonLoginbutton() {
		Loginbtn.click();
	}	
	
	public String LoginFail() throws InterruptedException {
		Thread.sleep(2000);
		return LoginFail.getText();
	}
}
