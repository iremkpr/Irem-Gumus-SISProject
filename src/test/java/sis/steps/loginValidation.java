package sis.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class loginValidation extends CommonMethods {

	@When("I Enter the Username")
	public void i_enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
		sendText(login.username, ConfigsReader.getProperty("username"));
	    
	}
	@When("I Enter the Password")
	public void i_enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		sendText(login.password, ConfigsReader.getProperty("password"));
	}
	@When("I Click the Login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    click(login.loginButton);
	}
	@Then("I validate that Student Information Page Exist")
	public void i_validate_that_student_information_page_exist() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Logo is not exist",login.neoLogo.isDisplayed());
	   
	}

}
