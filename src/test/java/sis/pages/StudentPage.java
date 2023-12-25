package sis.pages;

import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class StudentPage extends CommonMethods{

	

	public StudentPage() {
		PageFactory.initElements(driver, this);

	}
}
