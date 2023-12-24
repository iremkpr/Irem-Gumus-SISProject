package sis.steps;

import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

	@Before
	public static void startUp() throws InterruptedException {
		BaseClass.setUp();
	}

	@After
	public static void closeDown(Scenario scenario) {

		byte[] picture;

		if (scenario.isFailed()) {

			picture = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		
		} else {

			picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());

		BaseClass.tearDown();
	}

}
