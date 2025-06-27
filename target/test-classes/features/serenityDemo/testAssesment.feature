Feature: Login to Test Bank application as a Bank Manager and create and delete customer and verify

	Scenario: Login to Test Bank application as a Bank Manager 
	Given user is on home page
	When enter as bank manager login
	And create customers
	Then customer tab verify customers are created
	Then delete specific customer