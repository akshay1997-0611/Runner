package testme;

import org.testng.annotations.Test;


import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.*;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin= {"pretty","html:report\\cucumberreport","json:report\\cucumber.json"},
		features="C:\\Users\\aksha\\eclipse-workspace\\CucumberTest\\src\\test\\feature",
		glue= {"LoginTest"},
		tags= "@tag1" )


public class runnerTest {


	}


