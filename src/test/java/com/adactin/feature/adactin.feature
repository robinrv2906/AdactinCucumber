Feature: Hotel Booking In Adactin Application 

Scenario: User Login In The Web Application 
	Given user Launch The Application 
	When user Enter The "william1234" In Username Field 
	And user Enter The "User@123" In Password Field 
	Then user Click The Login Button And It Navigates To Search Hotel Page 
	
Scenario: User Search Hotel In Web Application 
	When user Select The Hotel Location 
	And user Select The Hotel 
	And user Select The Room Type 
	And user Select The Number of Rooms 
	And user Enter The Check In Date In Chech In Date Field 
	And user Enter The Chech Out date In Check Out Date Field 
	And user Select The Number Of Adults Rooms 
	And user Select The Number Of Children Rooms 
	Then user Click The Search Button And It Navigates Select Hotel Page 
	
Scenario: User Select Hotel In Web Application 
	When user Select The Hotel Name 
	Then user Click The Continue Button And It Navigates To Book Hotel Page 
	
Scenario: User Book Hotel In web Application 
	When user Enter The First Name In First Name Field 
	And user Enter The Lastname In Lastname Field 
	And  user Enter The Address In Billing Address Field 
	And user Enter The Credit Card Number In Credit Cad Number Field 
	And user Select The Credit Card type 
	And user Select The Credit Card Expiry Month 
	And user Select The Credit Card Expiry Year 
	And user Enter The CVV Number In Cvv Number Field 
	Then user Click The Book Now Button 
	
Scenario: User LogOut The Web Application 
	Then user Click The LogOut Button 
	
