package pages;

import net.serenitybdd.annotations.Step;

public class HomePage {

		PODemoHomePage homePage;
	
	@Step
	public void openApplication() {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		homePage.open();
		
	}
	
	@Step
	public void enterasManager() {
		// TODO Auto-generated method stub
		homePage.enterasManager();
	}
	
	@Step
	public void createCustomer() {
		// TODO Auto-generated method stub
		homePage.createCustomer();
	}
	
	@Step
	public void verifyCreatedCustomers() {
		// TODO Auto-generated method stub
		homePage.verifyCreatedCustomers();
	}
	
	@Step
	public void deletecustomer() {
		// TODO Auto-generated method stub
		homePage.deletecustomer();
	}
	
}
