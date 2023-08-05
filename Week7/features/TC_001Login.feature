Feature: Login functionality of Leaftaps Application

Scenario: Login with Positive credentials
Given Open the Chrome browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed

Scenario: Login with negative credentials
Given Open the Chrome browser
And Load the url
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on the Login button
But ErrorMessage should be displayed


