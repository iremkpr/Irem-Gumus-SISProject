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
	
	
	@FindBy(xpath="//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[2]/tbody/tr[14]/td[3]/div/button")
	public WebElement race;

	@FindBy(xpath="//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[2]/tbody/tr[14]/td[3]/div/div/ul/li[2]")
	public WebElement asian;

	
	
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
	
	@FindBy(id="studentStatus_list")
	public WebElement status;
	
	@FindBy(id="students_students")
	public WebElement studentsList;
	
	@FindBy(id="bStatusChange")
	public WebElement enroll;
	
	@FindBy(id="bEnroll")
	public WebElement bEnroll;	
	
	@FindBy(id="lStudentID")
	public WebElement id;	

	
	@FindBy(id="lStdName")
	public WebElement stdName;	

	@FindBy(id="lGrdSec")
	public WebElement grade;	

	@FindBy(id="lUserName")
	public WebElement userName;	

	
	public StudentPage() {
		PageFactory.initElements(driver, this);

	}
}
