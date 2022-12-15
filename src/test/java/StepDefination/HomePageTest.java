package StepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import BaseLayer.BaseClass;
import PagerLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageTest extends BaseClass{

	private HomePage homepage;
	
	@Then("Verify home page Title")
	public void verify_home_page_title() {
		homepage =new HomePage();
		assertEquals(true, homepage.captureHomePageTitle().contains("HRM"));
	}

	@Then("Verify Home Page Logo")
	public void verify_home_page_logo() {
		System.out.println(homepage.checkHomePageLogo());
		assertEquals(true, homepage.checkHomePageLogo());
	}

	@Then("Verify Home Page Url")
	public void verify_home_page_url() {
		assertEquals(true, homepage.captureHomePageUrl().contains("hrm"));
	}

}
