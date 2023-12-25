package sis.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class studentTabValidation extends CommonMethods{

@Given("I enter the username and password")
public void i_enter_the_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    sendText(login.username, ConfigsReader.getProperty("username"));
    wait(1);
    sendText(login.password, ConfigsReader.getProperty("password"));
    wait(1);
}
@When("I clicked the Student Tab")
public void i_clicked_the_student_tab() {
    // Write code here that turns the phrase above into concrete actions
	tabSelection(login.mainTabs, "Students");
}
@Then("I validated each individual sub-tab")
public void i_validated_each_individual_sub_tab() {

	//tabSelection(login.subTabs, "Parental");
//	tabValidaton(login.parentPage,"Parental" );
}



}
