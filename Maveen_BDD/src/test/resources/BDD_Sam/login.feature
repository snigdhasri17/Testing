Feature:login_page

Scenario:Check login is successful
Given browser is on open
When enters login details <username> and <password> 
#And browser is login as user
Then page navigate to website

Examples:

|username|password|
|standard_user|secret_sauce|
