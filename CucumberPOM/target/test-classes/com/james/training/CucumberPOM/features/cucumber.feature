Feature: Cucumber Application Test
 
 		Scenario: Validate Home Page Contact Us
		Given user opens browser
		Then user is on landing page
		Then user clicks contact us
		Then contact us page is displayed
		Then validate contact us page title
		Then validate contact us page heading 
		And the browser is closed
	
	
   Scenario: User Login Page
   	 Given user opens the browser
   	 Then user clicks on signin link
   	 Then signin page is displayed
   	 Then verify signin page title
   	 When user login with the following
   	 			|Username 								|Password |
   	 			|keithchingotah@gmail.com |123456		|
   	 			
   	 Then click login button
		 Then user should see the dashboard page
		 Then verify the page title
		 
		 
		Scenario Outline: User login with correct username and password
   	 Given user opens the browser
   	 Then user clicks on signin link
   	 Then signin page is displayed
   	 Then verify signin page title
   	 When user enters a valid username "<username>" 
   	 And user enters a valid password "<password>"
   	 And click login button
		 Then user should see the dashboard page
		 Then verify the page title
		 
		 Examples:
      | username 									| password |
      | keithchingotah@gmail.com  | 123456   |
   	 
		