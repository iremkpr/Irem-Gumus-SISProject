package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/features/",

		glue = "com.neotech.steps",

		dryRun = false,

		tags = "@login1",

		monochrome = true,
		
		plugin = {
				"pretty",
				"html:target/cucumber-default-report.html",
				
				//creates a txt file of failed tests under the target file so that you can rerun them
				"json:target/cucumber.json",
				
				"rerun:target/failed.txt"
				}
)

public class RegressionRunner {

	
	
}
