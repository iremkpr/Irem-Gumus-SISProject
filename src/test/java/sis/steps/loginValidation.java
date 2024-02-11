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
	    //jsClick(login.loginButton);
	    wait(1);
	}
	@Then("I validate that Student Information Page Exist")
	public void i_validate_that_student_information_page_exist() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Logo is not exist",home.neoLogo.isDisplayed());
	   
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
		if(home.neoLogo.isDisplayed()) {
			Assert.assertTrue("Student Information Page not Opened.Test Failed!",home.neoLogo.isDisplayed());
			System.out.println("Student Information Page Exist. Test Passed!");
		}
	    
	}

	// sub-tab validations 

	@Then("I validate Announcement is visible")
	public void i_validate_announcement_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
		if(home.anouncment.isDisplayed()) {
			Assert.assertEquals("Announcement is not visible! Test Failed","Add New Announcement",home.anouncment.getText());
			System.out.println("Announcement is visible");
		}
	}
	@Then("I validate url is as expected")
	public void i_validate_url_is_as_expected() {
	    // Write code here that turns the phrase above into concrete actions
		boolean urlCheck=driver.getCurrentUrl().contains("MainPage.aspx");
		Assert.assertTrue("Url is not contains MainPage.aspx. Test Failed", urlCheck);
	}

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

	@When("I enter the {string} , {string} and click the Login button")
	public void i_enter_the_and_click_the_login_button(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions

	    sendText(login.username,username );
	    sendText(login.password, password);
	    click(login.loginButton);
	
	}


@Then("I validate the student {string}, {string}, {string}, {string}")
public void i_validate_the_student(String StudentId, String StudentName, String GradeSection, String UserName) {
    // Write code here that turns the phrase above into concrete actions
	String existId= student.id.getText();
	String existName= student.stdName.getText();
	String existGrade= student.grade.getText();
	String existUserName= student.userName.getText();
	if(existId.equals(StudentId)) {
		Assert.assertTrue("Id is not as expected", existId.equals(StudentId));
		System.out.println("Id is as expected");
	}
	if (existName.equals(StudentName)) {
		Assert.assertTrue("Student Name is not as expected", existName.equals(StudentName));
		System.out.println("Student Name is as expected");

	}
	if(existGrade.equals(GradeSection)) {
		Assert.assertTrue("Grade Section is not as expected", existGrade.equals(GradeSection));
		System.out.println("Grade Section is as expected");

	}
	if(existUserName.equals(UserName)) {
		Assert.assertTrue("User Name is not as expected",existUserName.equals(UserName));
		System.out.println("User Name is as expected");

	}
	

}

	
	@Then("I validate the Teachers name {string}")
	public void i_validate_the_teachers_name(String profileName) {
	    // Write code here that turns the phrase above into concrete actions
			String name=home.userName.getText();
		if(name.equals(profileName)) {
			Assert.assertTrue("Teacher name is not as expected!Test Failed", name.equals(profileName));
			System.out.println("Teacher name as expected!Test Passed");
		}
	}
	@Then("I validate the all Tabs")
	public void i_validate_the_all_tabs() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("I validate the Parents name {string} and {string}")
	public void i_validate_the_parents_name_and(String FullName, String Address) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}




}
