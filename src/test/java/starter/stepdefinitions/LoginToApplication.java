package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.HomePage;

public class LoginToApplication {
	
	@Steps
	HomePage homePage;
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
    
    homePage.openApplication();
	}

	@When("enter as bank manager login")
	public void enterasManager() {
   
    homePage.enterasManager();	
	}

	@When("create customers")
	public void create_customers() {
    
		homePage.createCustomer();
		//homePage.clickOnLoginButton();
	}

	@Then("customer tab verify customers are created")
	public void customer_tab_verify_customers_are_created() {
		homePage.verifyCreatedCustomers();
	}
	
	@Then("delete specific customer")
	public void delete_specific_customer() {
		homePage.deletecustomer();
	}
	
	
}