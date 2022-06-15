@Regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed
  Accounts are: librarian, student, admin

  Background: For the scenarios in the future file, user is expected to be on login page
  #Bavkground is like @BeforeMethod, it runs the given before each scenario
  Given user is on the library login page
  #wip=work in progress
  @librarian @employee @wip
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
    #We can comment by using '#' sign

  @student @db
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard