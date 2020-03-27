Feature: Search a hotel using Adactin website

  Scenario: login to adactin page
    Given launch the browser and hit the url
  	When enter the username in username field
  	And user enter the password in password field
    Then user clicks on login button
    
 
  Scenario: Search a hotel
    When user enters "<location>" 
    And user select a hotel 
    And user enters room type
    And user enters number of rooms
    And user enters check in date
    And user enters checkout date
    And user enters number of adults in a room
    And user enters number of children in a room
    Then click on search button

   
