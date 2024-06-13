Feature: Update Profile WorkIndia Application 

 @UpdateProfile
Scenario Outline: User Filling General Details to Update Profile
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
    Then User will Click on Profile Icon, User Will Click On My Profile Icon
    Then User Will Select School Medium
    Then User Will Select Qualification
    Then User will click on Back button
     
     Examples: 
    | Name     |   PhoneNumber  |location|
    | Rajat  |  9876543123    |Karol Bagh|