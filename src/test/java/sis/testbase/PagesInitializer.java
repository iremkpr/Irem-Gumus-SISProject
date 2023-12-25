package sis.testbase;


import sis.pages.*;

public class PagesInitializer extends BaseClass {

	public static LoginPage login;
	public static HomePage home;
	public static StudentPage student;
	public static void inititalize() {
		
		login = new LoginPage();
		home= new HomePage();
		student= new StudentPage();
	}

}
