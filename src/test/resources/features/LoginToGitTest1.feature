Feature: Test scenario for Git


  Scenario: Login to Githab

    Given User is on "Login Page"

    When User enters unsername as "Julia864" and password as "Crematorium#13" on "Login Page"

    Then User is successfully navigated to the "https://github.com/"
    And User info "Julia864" on "Home Page" is present on navigation panel


  Scenario: Wrong Login to Githab

    Given User is on "Login Page"

    When User enters unsername as "Julia864" and password as "Crematorium#16" on "Login Page"

    Then User stays on the login module at the "https://github.com/session"
    And Error message "Incorrect username or password" on "Home Page" is displayed



  Scenario: Button New on Githab

    Given User is on "Login Page"

    When User enters unsername as "Julia864" and password as "Crematorium#13" on "Login Page"

    Then User is successfully navigated to the "https://github.com/"
    And Button "New" on "Home Page" is displayed