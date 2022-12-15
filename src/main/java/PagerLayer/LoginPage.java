package PagerLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Utilsclass;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void typeUsernameAndPassword(String uname, String pass) {
		Utilsclass.enterData(username, uname);
		Utilsclass.enterData(password, pass);
	}

	public void clickonLoginButton() {
		Utilsclass.clickOnElement(loginbutton);
	}

}
