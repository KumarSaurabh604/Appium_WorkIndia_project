Feature: Create a Job Alert for me in WorkIndia Application 

 @efg
Scenario Outline: User Cant create job alert with invalid inputs
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
    Then User will Click On create Job Alert
    Then User will click on Job Alert submit button
     
     Examples: 
    | Name     |   PhoneNumber  |location|
    | Aadarsh  |  1234567897    |Karol Bagh|