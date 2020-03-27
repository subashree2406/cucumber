Feature: Automation Practice
@search
Scenario: verify login
Given user launches the browser and clicks the url
When user clicks the signin button
And user clicks the emailfield
And enters emailid in the idfield
And user click and enter password in password field
Then verify login button is displayed
Then click on login button

Scenario: select a product using mousehover
When user select womenfield using mousehover
And click on womenfield in account page
And select topsfield by clicking on it
And click on Tshirt field in the application
And scroll to orangeshirt
And click on Addtocart on orange shirt
Then Proceed to checkout
And in summary of authenticationpage select proceed to checkout
And in Address bar give some message inside textarea
And click on proceedtocheck after text
And in shipping bar click on tickbox and proceed to checkout
And in payment click on payment by wire
Then click on I Confirm my order


