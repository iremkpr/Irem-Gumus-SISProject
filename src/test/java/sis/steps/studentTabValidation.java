package sis.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
public class studentTabValidation extends CommonMethods{

@When("I enter the username and password")
public void i_enter_the_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    sendText(login.username, ConfigsReader.getProperty("username"));
    sendText(login.password, ConfigsReader.getProperty("password"));
}
@Then("I Clicked the Login button")
public void i_click_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
//    click(login.loginButton);
    //jsClick(login.loginButton);
	login.loginButton.click();
	wait(1);
}
@Then("I clicked the Student Tab")
public void i_clicked_the_student_tab() {
    // Write code here that turns the phrase above into concrete actions
	tabSelection(home.mainTabs, "Students");
	
}

@Then("I validated each individual sub-tab")
public void i_validated_each_individual_sub_tab(DataTable dataTable) {
	List<Map<String, String>> tabNameList=dataTable.asMaps();
	for(Map<String, String> t:tabNameList) {
		 
		tabSelection(home.subTabs,t.get("TableName"));
		
	}
	
	
	

}




}
