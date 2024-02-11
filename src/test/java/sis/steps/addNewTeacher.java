package sis.steps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;

import sis.utils.CommonMethods;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class addNewTeacher extends CommonMethods {

	@Then("I clicked the Staff\\/Faculty Tab and Add New button")
	public void i_clicked_the_staff_faculty_tab_and_add_new_button() {
	    // Write code here that turns the phrase above into concrete actions
		tabSelection(home.mainTabs, "Staff/Faculty");
	}
	
	@Then("I provide the all required informations")
	public void i_provide_the_all_required_informations() {
	    // Write code here that turns the phrase above into concrete actions
		selectDropdown(staff.jobPosition,"Teacher/Teacher" );
		sendText(staff.tLastName, "Gumus");

		sendText(staff.tFirstName, "Irem");
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(staff.tDateofBirth1).perform();

        WebElement hiddenElement = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.getElementById('tDateofBirth');");
        
        hiddenElement.sendKeys("11/02/1997");
		
		click(staff.tSSN);
		sendText(staff.tSSN, "123456789");
		selectDropdown(staff.dGender_list,"Female");
		sendText(staff.tPassword, "iremkop");

		sendText(staff.tAddress, "USA");
		sendText(staff.tCity, "North Bergen");

		selectDropdown(staff.state_list, "NJ");
		
		sendText(staff.tZip, "07047");
		sendText(staff.tCellPhone, "1234537568");

		click(staff.tSubmit);
		
		if(isAlertPresent(driver)) {
			Assert.assertTrue("Empty teacher data added.Test FAIL", isAlertPresent(driver));
			acceptAlert();
			System.out.println("Empty teacher data not added.Test Passed!");
			
		}
		else {
			System.out.println("New teacher added with valid data.Test Passed!");
			click(student.photoChange);

			switchToChildWindow();
			
			String filePath= System.getProperty("user.dir")+"/screenshots/SIS/Images.jpg";
			sendText(student.fileUpload, filePath);
			click(student.photoSubmit);
			acceptAlert();
			switchToChildWindow();
		}
		
		

		
	}
	


}
