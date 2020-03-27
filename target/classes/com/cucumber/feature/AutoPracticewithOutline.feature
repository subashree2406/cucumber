Feature: Automation Practice using scenario outline

  Scenario: login to the application
    Given Launch the browser and click on url
    When click on signin button
    And user enters the username in emailid field
    And user enters the password in password field
    Then user click on signin button

  
  Scenario Outline: Buy a product using search menu
    When user enter a "<Product>" in search menu
    And user mousehover to the product
    And user click on addtocart button
    And user click on proceed to checkout in popup box
    And user again click on proceed to checkout in summary of authentication page
		And in Address bar give some message inside textarea
		And click on proceedtocheck after text
		And in shipping bar click the tickbutton and proceed to checkout1
		And user pay by clicking on payment by wire
		Then user click on I Confirm my order
	Examples:
	|Product|
	|blouses|
	|T-shirts|
	|Printed Dresses|
	
	Scenario: logout of the application
	Then user click on signout button to logout of the page 
		
		


    

    