package starter;  

import org.junit.runner.RunWith;   
import io.cucumber.junit.CucumberOptions; 
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(                  
		features = "src/test/resources/features/serenityDemo/testAssesment.feature",         
		      
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue = {"starter.stepdefinitions"}
		
)     

public class CucumberTestSuite {}