package sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class HomePage extends CommonMethods{
	
	//public List<WebElement> mainTabs=driver.findElements(By.xpath("//form[@id='form1']/table[2]//tr[1]/td/a"));
	//public List<WebElement> subTabs=driver.findElements(By.xpath("//form[@id='form1']//td[3]/table[1]//td/a"));
	
	@FindBy(xpath = "//form[@id='form1']/table[2]//tr[1]/td/a")
	public List<WebElement> mainTabs;
	
	@FindBy(xpath = "//form[@id='form1']//td[3]/table[1]//td/a")
	public List<WebElement> subTabs;
	
	
	@FindBy(id="Header1_imgSchoolLogo")
	public WebElement neoLogo;
	
	
	
	@FindBy(xpath="//*[@id=\"form1\"]/table[3]//a[@id=\"bNewAnnouncement\"]")
	public WebElement anouncment;
	
	@FindBy(id="//table[@id='parentTable']//tr[1]//input[1]")
	public WebElement Parental;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);

	}
	
}
