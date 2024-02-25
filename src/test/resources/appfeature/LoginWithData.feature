Feature:Login to app with data
Scenario: Login with correct credential
Given I am at the landing page
When I am enter the user name as "testusername"
And I am enter the password as "Test@1234"
And I will click on submit button
Then I should get logged into app 
