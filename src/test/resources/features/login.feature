Feature: Login Feature
@Smoke
  Feature: some
  @smokeTest
Scenario: Successful Login with Valid Credentials
  Given the user is on the login page
  When the user enters a valid username and password
  And clicks the login button
  Then the user should be redirected to the homepage
