Feature: Login to the Application

Scenario: Verify Login Page Title
	Given User is on Login Page
	When User gets the Title of Login page
	Then Login Page Title should be "Sign in to stanley"
	

#Scenario: Login with Valid credetials	
#	Given User is on Login Page
#	When User Enters Username "superadmin"
#	And User Enters Password "stanley@123"
#	And User clicks on SignIn button
#	Then User gets the Title of Home Page
#	And Home Page Title should be "Stanley"
	