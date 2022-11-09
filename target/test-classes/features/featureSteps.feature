Feature: sign up 
@Registration
  Scenario Outline: Signup to the application
    Given User clicks on sign up link
    When User enters "<firstname>" firstname "<lastname>" lastname "<email>" email "<username>" username "<password>" password and "<confirmpwd>" confirmpwd 
    Then User clicks on register button
    Then verify the registartion is successful
    Then User clicks on logout button
    
    Examples: 
      | firstname | lastname | email | username | password | confirmpwd |
      | Sritapa   | Laha     | sritapaLaha@test.com| sritapa | pwd011191| pwd011191 |
     

@login
Scenario Outline: Login to a application
    Given User enters "<username>" username and "<password>" password
    When User clicks on login button
    Then Verify user logged in successfully
    Then User clicks on inbox link
    Then User clicks on compose mail image
    Then User search for recipient
    Then User enters mail title
    Then User clicks on send message button
    Then User verify message has been sent successfully
    Then User clicks on logout button
    
  
  Examples: 
      | username | password | 
      | sritapa | pwd011191|  