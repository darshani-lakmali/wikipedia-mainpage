Feature:Wikipedia Main Page in English
Scenario:Title of main page
Given user is on main page
When user gets the title of main page
Then main page title should be "Wikipedia, the free encyclopedia"

Scenario:Title of Wiki logo
Given user is on main page
When user hover over the title of the logo
Then logo title should be "Visit the main page"

Scenario:User search a key word
Given user is on main page
When user search "Melbourne" in search box
Then page title should be "Melbourne - Wikipedia"