@Smoke

Feature: Sign in to Website

  Scenario: User can successfully sign in to website

    Given User Launch Login Page
    When Provide Valid Email Address Provide Valid Password
    And Click Login Button
    Then User Login To System Successfully


  Scenario: User can't sign in to website

    Given User Launch Login Page
    When Provide Invalid Email Address Provide Valid Password
    And Click Login Button
    Then User Fails To Login