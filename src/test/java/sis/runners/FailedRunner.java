package sis.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		//the file where rerun created the txt with failed tests
		features = "@target/failed.txt",
		
		glue = "com.neotech.steps"
		)

public class FailedRunner {

}
