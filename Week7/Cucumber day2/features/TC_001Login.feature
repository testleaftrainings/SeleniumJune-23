Feature: Login functionality of Leaftaps Application

#Background:
#Given Open the Chrome browser
#And Load the url

@Smoke
Scenario: Login with Positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed

@Regression
Scenario: Login with negative credentials
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on the Login button
But ErrorMessage should be displayed


