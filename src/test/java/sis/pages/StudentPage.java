package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class StudentPage extends CommonMethods{

	@FindBy(id="tStateId")
	public WebElement stateId;

	@FindBy(id="tLastName")
	public WebElement lastName;
		
	@FindBy(id="tFirstName")
	public WebElement firstName;
	
	@FindBy(id="tPassword")
	public WebElement password;
	
	@FindBy(id="bAdd")
	public WebElement addButton;
	
	@FindBy(id="cGradeLevel_list")
	public WebElement gradeLevel;
	
	@FindBy(id="tSSN")
	public WebElement ssn;
	
	@FindBy(id="bSubmit")
	public WebElement submit;
	
	@FindBy(id="photoChange")
	public WebElement photoChange;
	
	@FindBy(id="fileUpload")
	public WebElement fileUpload;
	

	@FindBy(id="bSubmit")
	public WebElement photoSubmit;
	
	public StudentPage() {
		PageFactory.initElements(driver, this);

	}
}
