package StepDefination;

import BaseLayer.BaseClass;
import PagerLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass {
	private LoginPage loginpage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.inilization();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		loginpage = new LoginPage();
		loginpage.typeUsernameAndPassword(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("user click on Login button")
	public void user_click_on_login_button() {

		loginpage.clickonLoginButton();
	}

}
