Feature: WorkIndia Application Invalid Registration

   @WrongRegistration
  Scenario Outline: User with enter Name and Invalid Mobile Number in to the Application
    Given User has already on the  Registration page of Application
    When  User enter the Entries "<FullName>" and "<MobileNumber>"
    Then User click on Submit button of Application
   

  Examples: 
    | FullName     |   MobileNumber  |
    | Rajat  |   96509157   |