@Smoke

Feature: Register to Website

  Scenario: User can successfully register to website

    Given User open browser and navigate to website
    When Choose Gender
    And Provide First Name
    And Provide Last Name
    And Provide Birth Date
    And Provide Email Address
    And Set Password
    And Confirm Password
    And Submit Form
    Then Success Message Appear
