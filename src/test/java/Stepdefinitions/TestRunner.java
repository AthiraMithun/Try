package Stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/resources/Features/login.feature"},glue= {"Stepdefinitions"},plugin= {"pretty"})
public class TestRunner extends AbstractTestNGCucumberTests{

	
}
