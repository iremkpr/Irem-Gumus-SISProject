package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class staffFacultyPage extends CommonMethods {
	
	@FindBy(id="jPosAccLev")
	public WebElement jobPosition;
	
	@FindBy(id="tFirstName")
	public WebElement tFirstName;
	
	@FindBy(id="tLastName")
	public WebElement tLastName;
	
	
	
	@FindBy(id="tDateofBirth")
	public WebElement tDateofBirth1;

	
	@FindBy(id="birthDayCal_container")
	public WebElement tDateofBirth;
	
	@FindBy(id="tSSN")
	public WebElement tSSN;

	@FindBy(id="dGender_list")
	public WebElement dGender_list;

	@FindBy(id="tPassword")
	public WebElement tPassword;

	@FindBy(id="tAddress")
	public WebElement tAddress;

	@FindBy(id="tCity")
	public WebElement tCity;

	@FindBy(id="state_list")
	public WebElement state_list;

	@FindBy(id="tZip")
	public WebElement tZip;

	@FindBy(id="tCellPhone")
	public WebElement tCellPhone;

	@FindBy(id="bSubmit")
	public WebElement tSubmit;

	
	public  staffFacultyPage() {
		PageFactory.initElements(driver, this);

	}
}
