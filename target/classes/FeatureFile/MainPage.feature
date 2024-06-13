
Feature: Valid WorkIndia Application 

  @NameSubmission
  Scenario Outline: User with enter Name and the Mobile Number in to the Application
    Given User has already on Registration page
    When  User enter the "<Name>" and "<PhoneNumber>"
    And User click on Submit button
    And User will Select the city
    And User will enter the nearest "<location>"
    Then User will click on Submit button 
    

  Examples: 
    | Name     |   PhoneNumber  |location|
    | Saurabh   |   9876543219  |Karol Bagh|

  @FinalRegistration
  Scenario Outline: User Filling General Details
    Given User has already on Registration page
    When  User enter the "<Name>" and "<PhoneNumber>"
    And User click on Submit button
    And User will Select the city
    And User will enter the nearest "<location>"
    Then User will click on Submit button 
    Then User will select the Gender , User chooses the qualification , User select the school medium
    Then User select the english fluency
    Then User select the experience and User select the age 
    Then User chooses the interest area
    Then User will click on Submit btn
    Then User will click on Specialization
    Then User will select the specialiazation He Has
    Then User will click on Specialization Submit button
    Then User will click on Degree 
    Then User will Select the Degree He Has
    Then User will Click On Degree Submit button
    Then User will Select Language of his/her Choice
     Examples: 
    | Name     |   PhoneNumber  |location|
    | Saurabh Soni   |   1234567890   |Karol Bagh|
    