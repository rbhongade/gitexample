Feature: Validation of the demo flight.
    Scenario: Test for source and destination
    
      Given Open the home page.
      When Select the departure Destination City.
      And click on the find flight
      Then validate the title page
