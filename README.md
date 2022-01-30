# wikipedia-mainpage
This is for InfoTrack assignment to automate the wikipedia main page.Following Test scenarios are covered from this automation suite.
1. Title of main page.
2. Title of Wiki logo
3. User search a key word
4. Title of Login Page
5. Unregistered user tries to login

How to install this project:
1. Pull the code from the repository into your local git repository.
2. In the src/test/resources/config.properties file, default browser has been set to 'chrome'. for the cross browser testing, browser property can be changed to the expected browser name. eg: firefox, edge
3. Install and set up java and maven in your machine.
4. Open command prompt
5. cd until the automation project root directory.
6. Run the command. 
mvn clean test

How to run the reports:
1. Spark extent html report and extent pdf reports are made enable for this project. 
  a. extent.pdf report will be generated in the test output folder of the project root directory.
    eg:C:\WikipediaMainPage\test output\PdfReport\ExtentPdf.pdf
  b. index.html report will be generated in the test-output folder of the project root directory.
    eg:C:\WikipediaMainPage\test-output\SparkReport\index.html

