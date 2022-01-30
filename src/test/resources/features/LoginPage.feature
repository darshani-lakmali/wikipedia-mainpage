Feature: Wikipedia invalid Login test Feature
Background:
Given user is on main page
And click the login link

Scenario: Title of Login Page
When user gets the title of login page
Then login page title should be "Log in - Wikipedia"

Scenario: Unregistered user tries to login
When user enters a username and a password
|username|password|
|Darshani|123456|
And user clicks on login button
Then user gets the error message "Incorrect username or password entered. Please try again."