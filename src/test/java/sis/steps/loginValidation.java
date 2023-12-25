package sis.steps;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class loginValidation extends CommonMethods {

	
	@When("I Click the Login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    click(login.loginButton);
	    wait(1);
	}
	@Then("I validate that Student Information Page Exist")
	public void i_validate_that_student_information_page_exist() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Logo is not exist",login.neoLogo.isDisplayed());
	   
	}
	
	// empty
	@When("I entered the username {string}")
	public void username(String username) {
	    // Write code here that turns the phrase above into concrete actions
		sendText(login.username, username);
	}
	@When("I entered the password {string}")
	public void password(String password) {
	    sendText(login.password, password);
	}

	@Then("I validate Student Information Page")
	public void i_validate_student_information_page() {
		if(login.neoLogo.isDisplayed()) {
			Assert.assertTrue("Student Information Page not Opened.Test Failed!",login.neoLogo.isDisplayed());
			System.out.println("Student Information Page Exist. Test Passed!");
		}
	    
	}

	// sub-tab validations 

	@Then("I validate Announcement is visible")
	public void i_validate_announcement_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
		if(login.anouncment.isDisplayed()) {
			Assert.assertEquals("Announcement is not visible! Test Failed","Add New Announcement",login.anouncment.getText());
			System.out.println("Announcement is visible");
		}
	}
	@Then("I validate url is as expected")
	public void i_validate_url_is_as_expected() {
	    // Write code here that turns the phrase above into concrete actions
		boolean urlCheck=driver.getCurrentUrl().contains("MainPage.aspx");
		Assert.assertTrue("Url is not contains MainPage.aspx. Test Failed", urlCheck);
	}

	@Then("I validate alert")
	public void i_validate_student_information_page_is_not_exist() {
		try {
	        if (isAlertPresent(driver)) {
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
	            if (alertText.equals("Please fill required fields") ) {
	                // Handle the alert by accepting it
	                alert.accept();

	                Assert.assertEquals(alertText, "Please fill required fields");
	                System.out.println("Student Information Page is not exist");
	            }
	            else if( alertText.equals("Either username and password do not match or your account doesn't have  access for the selected Academic Year.")) {
	                alert.accept();

	                Assert.assertEquals(alertText,"Either username and password do not match or your account doesn't have  access for the selected Academic Year.");
	                System.out.println("Student Information Page is not exist");

	            }
	        } else {
	            System.out.println("No alert present. Test Failed!");
	        }
	    } catch (NoAlertPresentException e) {
	        e.printStackTrace();
	        // Handle the exception, if needed
	    }
	}



}
