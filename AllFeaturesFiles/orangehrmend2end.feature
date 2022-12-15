Feature: Test Orange HRM Application

  @All
  Scenario: Test Login Functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on Login button

  @All
  Scenario: Test Home Page Functionality
    Then Verify home page Title
    And Verify Home Page Logo
    And Verify Home Page Url

  @All
  Scenario: Test PIM Page Functionality
    When User is on PIM page
    Then validate user is on pim page using url

  @All
  Scenario: Create New user in PIM Page
    When user click on Add button
    When user is on Add Employee Page
    Then user can enter firstname and last name
    Then user can capture employee id
    Then user click on save button

  @All
  Scenario: Search PIM Page employee and delete employee
    When user click on employee list
    When user enter employee id Number
    Then user click on search button
    And user click on checkbox
    And click on Delete selected
    Then capture popup text
    Then click on yes delete button
