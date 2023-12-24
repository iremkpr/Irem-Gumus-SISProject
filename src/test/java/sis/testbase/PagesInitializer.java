package sis.testbase;

import sis.pages.LoginPage;

public class PagesInitializer extends BaseClass {

	public static LoginPage login;
	
	public static void inititalize() {
		
		login = new LoginPage();

	
	}

}
