package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import util.DriverFactory;

public class LoginPageTestSteps {
	
	static String title;
	private MainPage mainPage=new MainPage(DriverFactory.getDriver());
	private LoginPage loginPage;
	
	@Given("click the login link")
	public void click_the_login_link() throws InterruptedException {
	    loginPage=mainPage.clickOnLogin();
	}

	@When("user gets the title of login page")
	public void user_gets_the_title_of_login_page() {
		title=loginPage.verifyLoginPageTitle();
	}
	
	@Then("login page title should be {string}")
	public void login_page_title_should_be(String expectedTitle) {
	    Assert.assertEquals(expectedTitle, title);
	}
	
	@When("user enters a username and a password")
	public void user_enters_a_username_and_a_password(DataTable dataTable) {
		List<Map<String,String>> credList=dataTable.asMaps(String.class, String.class);
		String userName=credList.get(0).get("username");
		String password=credList.get(0).get("password");
		loginPage.Login(userName,password);
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.ClickonLoginbutton();
	}
	@Then("user gets the error message {string}")
	public void user_gets_the_error_message(String expectedErrorMsg) throws InterruptedException {
	    String loginFailMessage=loginPage.LoginFail();
	    Assert.assertEquals(expectedErrorMsg, loginFailMessage);
	}



}
