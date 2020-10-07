Feature: As a user
  I should be able to register

  Scenario: validate new user registration with valid data's

    Given I'm on Homepage
    When I click register now button
    And I could enter email address "GeorgeLynn@gmail.com"
    And I could enter confirm email address "GeorgeLynn@gmail.com"
    And I could enter password "GeorgeLynn@123"
    And I could enter confirm password "GeorgeLynn@123"
    When I choose the title "Mrs"
    When I provide firstname "George" and lastname "Lynn"
    When I choose registration option "Join the executive club"
    When I choose address type "Home"
    And I provide address "56, Eastcoast road, london, e12 2ds"
    And I could choose country/Region of Residence "United Kingdom"
    And I could choose date of birth data as "2" month as "11" and year as "1996"
    And I could choose gender "Female"
    And I could choose preferred language "English"
    And I click Terms and conditions
    Then I should able to register with the successful message "Registered successfully"