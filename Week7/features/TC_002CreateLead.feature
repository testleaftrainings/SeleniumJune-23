Feature: CreateLead functionality of Leaftaps Application

Scenario Outline: CreateLead with multiple data
Given Open the Chrome browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
And Click CreateLead link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on createLead button
Then ViewLeadsPage should be displayed as <companyname>

Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|S|
|Qeagle|Vidhya|R|
