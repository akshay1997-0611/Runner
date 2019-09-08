package testme;

import org.testng.annotations.Test;


import org.junit.runner.RunWith;
import cucumber.api.*;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json"},
		features="C:\\Users\\aksha\\eclipse-workspace\\CucumberTest\\src\\test\\feature",
		tags= {"tag1","tag2"}
		)


public class runnerTest {


	}


