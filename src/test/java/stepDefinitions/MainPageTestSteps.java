package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.MainPage;
import util.ConfigReader;
import util.DriverFactory;

public class MainPageTestSteps {
	private MainPage mainPage=new MainPage(DriverFactory.getDriver());
	static String title;
	static String logoTitle;
	private ConfigReader configReader=new ConfigReader();
	
	@Given("user is on main page")
	public void user_is_on_main_page() {
		DriverFactory.getDriver().get(configReader.init_prop().getProperty("url"));
		//DriverFactory.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	@When("user gets the title of main page")
	public void user_gets_the_title_of_main_page() {
	   title=mainPage.verifyMainPageTitle();
	   System.out.println(title);
	}
	
	@Then("main page title should be {string}")
	public void main_page_title_should_be(String expectedTitleName) {
		Assert.assertEquals(expectedTitleName,title);
	}
	
	@When("user hover over the title of the logo")
	public void user_hover_over_the_title_of_the_logo() {
		logoTitle=mainPage.hoverOverWikiLogo();
		System.out.println(logoTitle);
	}
	
	@Then("logo title should be {string}")
	public void logo_title_should_be(String expectedLogoName) {
		Assert.assertEquals(expectedLogoName,logoTitle);
	}

	@When("user search {string} in search box")
	public void user_search_in_search_box(String searchKey) {
	    mainPage.wikiSearch(searchKey);
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		title=mainPage.verifyMainPageTitle();
		Assert.assertEquals(expectedTitle,title);
	}






}
