package Testrunner_rushi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(
		//features = "rushikeh97231"
		
				
//		)


//@RunWith(io.cucumber.junit.Cucumber.class) 
@CucumberOptions( 
	    features = "src/test/java/rushikeh97231/F1.feature", 
	    glue ="STEPDEFINATION")
	    //format={"pretty","json:target/"},
	    //dryRun = true, 
	    //strict = true,      
	    //monochrome = true )

public class runner_rushi {

	
}
