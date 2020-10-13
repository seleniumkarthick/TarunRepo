Feature: To validate Menu Features 

Background:
Given user loads the application url

Scenario: To valide home menu
When user clicks home menu 
Then user should navigate to home page
And i quit the driver

@menu_test1
Scenario: To valide home menu
#Given user loads the application url
When user clicks "Contact us" menu 
Then user should navigate to "http://localhost:81/product/contactus.php" page
Then i quit the driver

@menu_test
Scenario Outline: To valide home menu
#Given user loads the application url
When user clicks "<link>" menu 
Then user should navigate to "<url>" page
Then i quit the driver

Examples:

|link|url|
|Contact us|http://localhost:81/product/contactus.php|
|About Us|http://localhost:81/product/aboutus.php|
|FAQ|http://localhost:81/product/faq.php|
|Feedback|http://localhost:81/product/feedback.php|

