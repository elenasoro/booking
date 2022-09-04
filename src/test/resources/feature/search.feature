Feature: Search
  Scenario: Search for hotel with Good rating
    Given Booking search page is opened
    When User enters hotel 'Hilton Dubai Jumeirah' title into the search field
    And User clicks on Search button
    Then Then 'Hilton Dubai Jumeirah' hotel is present on the page
    And Hotel rating is '7.9'
