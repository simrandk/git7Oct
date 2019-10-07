package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="features//login.feature",
glue= {"stepDefinition"},
plugin = {"json:target/snapshot/7Octreport.json"})


public class classrunner {

	public static void main(String[] args) {
	

	}

}
