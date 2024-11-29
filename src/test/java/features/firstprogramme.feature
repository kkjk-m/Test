Feature: Application Login

#Scenario: Admin Page Default Login
#Given User is on NetBanking landing page
#When User login into application
#Then Home Page is displayed
#And Cards are displyed


#Scenario: Admin Page default login
#Given User is on NetBanking landing page
#When User login into application with " Admin" and Psassword "1234"
#Then Home Page is displayed
#And Cards are displyed
#
#Scenario: Admin Page default login
#Given User is on NetBanking landing page
#When User login into application with " User" and Psassword "7890"
#Then Home Page is displayed
#And Cards are displyed

#Scenario: User Page default login
#Given User is on NetBanking landing page
#When User login into application with "<Username>" and Password "<Password>" combination
#Then Home Page is displayed
#And Cards are displyed
#Examples:
  #| Username | Password |
  #| Credit User | 32@jdjf |
  #| Debit User | je@640&* |

#Tags
@Test01
Scenario: User Page default sign up
Given User is on NetBanking landing page
When User signup into application
  | Shakuntala |
  | Shinde |
  | sdkl@gmail.com |
  | 987682323 |
Then Home Page is displayed
And Cards are displyed

@Test02
Scenario: User Page default sign up
Given User is on NetBanking landing page
When User signup into application
  | shyam |
  | Shinde |
  | sdkl@gmail.com |
  | 987682323 |
Then Home Page is displayed
And Cards are displyed

@Test03
Scenario: User Page default sign up
Given User is on NetBanking landing page
When User signup into application
  | Rahul |
  | Shinde |
  | sdkl@gmail.com |
  | 987682323 |
Then Home Page is displayed
And Cards are displyed

@Test04
Scenario: User Page default sign up
Given User is on NetBanking landing page
When User signup into application
  | Balika |
  | Shinde |
  | sdkl@gmail.com |
  | 987682323 |
Then Home Page is displayed
And Cards are displyed
  
  



