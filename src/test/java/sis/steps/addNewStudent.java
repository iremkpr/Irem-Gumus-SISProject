package sis.steps;



import io.cucumber.java.en.Then;
import sis.utils.CommonMethods;

public class addNewStudent extends CommonMethods{
	@Then("I clicked the Add New button")
	public void i_clicked_the_add_new_button() {

		click(student.addButton);
	}

	@Then("Fill the new student's expected details {string}, {string}, {string},{string},{string}")
	public void fill_the_new_student_s_expected_details(String stateId,String LastName, String FirstName, String GradeLevel, String Password) {
	  
		sendText(student.stateId, stateId);
		sendText(student.firstName, FirstName);
		sendText(student.lastName, LastName);
		sendText(student.password, Password);
		click(student.ssn);
		selectDropdown(student.gradeLevel,GradeLevel);
		
		click(student.submit);
		wait(1);

		acceptAlert();
		click(student.photoChange);

		switchToChildWindow();
		
		String filePath= System.getProperty("user.dir")+"/screenshots/SIS/Images.jpg";
		sendText(student.fileUpload, filePath);
		click(student.photoSubmit);
		acceptAlert();
		switchToChildWindow();

		wait(1);
	}



}
