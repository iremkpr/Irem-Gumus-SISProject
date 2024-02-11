package sis.testbase;


import sis.pages.*;

public class PagesInitializer extends BaseClass {

	public static LoginPage login;
	public static HomePage home;
	public static StudentPage student;
	public static ParentalPage parent;
	public static staffFacultyPage staff;
	
	public static void inititalize() {
		
		login = new LoginPage();
		home= new HomePage();
		student= new StudentPage();
		parent=new ParentalPage();
		staff=new staffFacultyPage();
	}

}
