package sis.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import sis.testbase.BaseClass;
import sis.utils.CommonMethods;

public class Hooks  {

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
