Feature: Conduit CRUD Functions

Scenario: Login Into App

    Given User is on Login page
    When User provide "divi.divyalakshmi3@gmail.com" and "Divya@22"
    Then User should be on Home Page
 
 Scenario: Create new Article 
  
		Given User should be on new  Page
    When User enters Article details
    |title| description | body | tags |
    | Divya sample34 | case Study | Created | Successfully |
    Then Article must be created
    | Created|
    
 Scenario: View Article
 
 		Given User should be on Global Feed Page
 		When User select an article "Article Title"
 		Then Article detail page must be displayed
 
 Scenario: Update an Article
 
    Given Article detail page must be displayed
    When  User update article detail
    Then Article details must be updated
 
 Scenario: Delete an Article
 
    Given Article detail page must be displayed
    When  User delete article
    Then Article must be deleted

 
 