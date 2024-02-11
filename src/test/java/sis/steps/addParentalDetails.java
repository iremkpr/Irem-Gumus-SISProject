package sis.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class addParentalDetails extends CommonMethods {
	@Then("I click the Parental Sub-Tab")
	public void i_click_the_parental_sub_tab() {
		tabSelection(home.subTabs, "Parental");
	
	}
	@Then("I select the new user from Total Students List")
	public void i_select_the_new_user_from_total_students_list() {
	    // Write code here that turns the phrase above into concrete actions

		selectDropdown(parent.gradeLevel,10);
		selectDropdown(student.status,"Enrolled");
		selectDropdown(student.studentsList, "Gumus Irem");

	}

	@Then("I added new informations for Primary Parent")
	public void i_added_new_informations_for_primary_parent(DataTable dataTable) {
		List<Map<String, String>> parentData = dataTable.asMaps();
		click(parent.addNew);
	  
		for(Map<String, String> p:parentData) {
			sendText(parent.fname, p.get("firstname"));
			sendText(parent.lname, p.get("lastname"));
			selectDropdown(parent.relation, p.get("relational"));
			click(parent.ppSave);
		}

	}
	@Then("I added new informations for Secondary Parent")
	public void i_added_new_informations_for_secondary_parent(DataTable dataTable) {
		List<Map<String, String>> secondParentData = dataTable.asMaps();
		click(parent.spaddNew);
		
		for(Map<String, String> p:secondParentData) {
			sendText(parent.sfname, p.get("firstname"));
			sendText(parent.slname, p.get("lastname"));
			selectDropdown(parent.srelation, p.get("relational"));
			click(parent.spSave);
			if(isAlertPresent(driver)) {
				Assert.assertTrue("Primary parent added",isAlertPresent(driver));
				System.out.println("Please Select Relation");
			}
		}
	
	
	}



@When("I enter the username, password and Login button")
public void i_enter_the_username_password_and_login_button() {
    // Write code here that turns the phrase above into concrete actions
    sendText(login.username, ConfigsReader.getProperty("username"));
    sendText(login.password, ConfigsReader.getProperty("password"));
	login.loginButton.click();

}
@Then("I clicked the Student Tab	and Parental Sub-Tab")
public void i_clicked_the_student_tab_and_parental_sub_tab() {
    // Write code here that turns the phrase above into concrete actions
	tabSelection(home.mainTabs, "Students");
	tabSelection(home.subTabs, "Parental");

}




}
