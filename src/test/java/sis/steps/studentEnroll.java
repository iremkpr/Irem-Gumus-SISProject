package sis.steps;

import io.cucumber.java.en.Then;
import sis.utils.CommonMethods;

public class studentEnroll extends CommonMethods{
	@Then("I select the Status")
	public void i_select_the_status() {
	    // Write code here that turns the phrase above into concrete actions
		selectDropdown(student.status, "New");
	}
	@Then("I select the new added user from Total Students List")
	public void i_select_the_new_added_user_from_total_students_list() {
		selectDropdown(student.studentsList, "Gumus Irem");
		wait(1);
 
	}
	@Then("I click the Enroll on user information page")
	public void i_click_the_enroll_on_user_information_page() {
	    click(student.enroll);
	    click(student.bEnroll);
	}
	@Then("I validate the user exist on the enrollments list")
	public void i_validate_the_user_exist_on_the_enrollments_list() {
	    selectDropdown(student.status,"Enrolled");
	    selectDropdown(student.studentsList,"Gumus Irem");
	}

}
