Feature: users can buy & sell the property on Zoopla

Scenario Outline:  Login with valid credential & Verify the home page

Given user able to open any browser
And  user able to submit"<URL>"
When user able to click on signin button
And  user able to enter the "<username>" and "<passWord>" 
And  user am able to submit signin button
And  user can enter the location & search it 
And  user can print all the price value
And  user can select the fifth property on list
And  user can verify the agent logo, name & phone no "Logo,Agent Name,Phone no"
And user can click on MyZoopla
And user can able to click signout button
Then  user can verify the logout title "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents"
And Close the browser

Examples:
| username                 |passWord                 |URL                      | 
| enamhaque@ymail.com      |  Nadianaba1             |https://www.zoopla.co.uk/|
