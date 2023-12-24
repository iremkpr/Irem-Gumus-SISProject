package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class LoginPage extends CommonMethods{

	@FindBy(id ="tUsername")
	public WebElement username;
	
	@FindBy(id ="tPassword")
	public WebElement password;
	
	@FindBy(id="bLogin")
	public WebElement loginButton;
	
	@FindBy(id="Header1_imgSchoolLogo")
	public WebElement neoLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
}
