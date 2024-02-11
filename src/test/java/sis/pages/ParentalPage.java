package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class ParentalPage extends CommonMethods{

	@FindBy(id="bAddNew")
	public WebElement addNew;
	
	@FindBy(id="bAddNewSP")
	public WebElement spaddNew;

	
	
	@FindBy(id="ppFirstName")
	public WebElement fname;
	
	@FindBy(id="spFirstName")
	public WebElement sfname;
	

	@FindBy(id="ppLastName")
	public WebElement lname;
	
	@FindBy(id="spLastName")
	public WebElement slname;
	@FindBy(id="bSave")
	public WebElement ppSave;

	@FindBy(id="ppRelation_list")
	public WebElement relation;

	@FindBy(id="spRelation_list")
	public WebElement srelation;

	@FindBy(id="bAddNewSP")
	public WebElement addSecond;
	@FindBy(id="bSaveSP")
	public WebElement spSave;

	@FindBy(id="dGradeLevel_list")
	public WebElement gradeLevel;

	@FindBy(id="bDelete")
	public WebElement pRemove;

	
	@FindBy(id="bDeleteSP")
	public WebElement sRemove;


	
	public ParentalPage() {
		PageFactory.initElements(driver, this);

	}
}
