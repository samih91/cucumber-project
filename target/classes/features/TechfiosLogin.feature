Feature: Techfios billing login page functioanlity validation 

Scenario: User should be able to login with valid credentials
Given User is on the techfios login page
When User enters username as "demo@codefios.com"
When User enters password as "abc123"
When User clicks on sign in button
Then User should land on dashboard page