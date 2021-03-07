Feature: Registration functionality scenarios

@Register @One
Scenario: Verify whether the user is able to register into the application by providing the details
Given I launch the application
And I naviagte to the account registration page
When I provide all the below valid details
	|FirstName |Ravi       		|
	|LastName  |kiran			|
	|Email     |ravikiran2@gmail.com	|
	|Telephone |9876543210		|
	|Password  |rkiran			|
And I select the privacy policy
And I click on the continue button
Then I should see that the user Account has successfully created

@Register @Two
Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
Given I launch the application
And I naviagte to the account registration page
When I click on the continue button
Then I should see that the User Account is not created
And I should see the error messages informing the user to fill the mandatory fields

@Register @Three
Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
Given I launch the application
And I naviagte to the account registration page
When I provide all the below valid details
	|FirstName |Ravi       		|
	|LastName  |kiran			|
	|Email     |ravikiran2@gmail.com	|
	|Telephone |9876543210		|
	|Password  |rkiran			|
And I subscribe to Newsletter
And I select the privacy policy
And I click on the continue button
Then I should see that the User Account has successfully created

@Register @Four
Scenario: Verify whether the user is restricted from registring a duplicate account
Given I launch the application
And I naviagte to the account registration page
When I provide the below duplicate details into the fields
	|FirstName |Ravi       		|
	|LastName  |kiran			|
	|Email     |ravikiran2@gmail.com	|
	|Telephone |9876543210		|
	|Password  |rkiran			|
And I select the privacy policy
And I click on the continue button
Then I should see the warning message stating that the user is already created


