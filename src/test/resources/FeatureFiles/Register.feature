Feature: Registration functionality scenarios

@Register @One
Scenario: Verify whether the user is able to register into the application by providing the details
Given I launch the application
And I naviagte to the account registration page
When I provide all the below valid details
	|FirstName |Ravi       		|
	|LastName  |kiran			|
	|Email     |xyz@gmail.com	|
	|Telephone |9876543210		|
	|Password  |rkiran			|
And I select the privacy policy
And I click on the continue button
Then I should see that the user Account has successfully created

