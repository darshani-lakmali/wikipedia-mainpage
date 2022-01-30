package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	//Page factory - Object Repository
	
		@FindBy(xpath="//body/div[@id='mw-navigation']/div[@id='mw-panel']/div[@id='p-logo']/a[1]")
		WebElement wikiLogo;
		
		@FindBy(xpath="//input[@id='searchInput']")
		WebElement searchWikipedia;
		
		@FindBy(xpath="//input[@id='searchButton']")
		WebElement searchButton;
		
		@FindBy(xpath="//span[contains(text(),'Log in')]")
		WebElement loginLink;
		
		private WebDriver driver;

		public MainPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this); //Initialize the page factory
		}
		
		//Actions
		public String verifyMainPageTitle() {
			return driver.getTitle();
		}

		public String hoverOverWikiLogo() {
			Actions action=new Actions(driver);
			action.moveToElement(wikiLogo).perform();
			return wikiLogo.getAttribute("title");
			
		}
		
		public void wikiSearch(String searchKey) {
			searchWikipedia.sendKeys(searchKey);
			searchButton.click();
		}
		
		public LoginPage clickOnLogin() throws InterruptedException{
			loginLink.click();
			return new LoginPage(driver);
		}
}
