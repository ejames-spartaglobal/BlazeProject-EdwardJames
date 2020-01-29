Feature: Flight Purchase
  As a user I want to be able to purchase a ticket to my target destination
  so that I can go on holiday

    @Outline
    Scenario: As a user I want to be able to select my departing location and desired destination into the search form so that I can find the tickets I want
      Given I am on the Travel the World page
      When I select my departure city
      And I select my destination city
      And I have clicked on the Find Flights button
      Then I will be able to view all the flights I can potentially get which fit my criteria

     @Outline
     Scenario: As a user I want to be able to select the flight I want to go on so that I can get my desired flight
       Given I am on the Find Flights page
       When I select my desired flight
       Then I can go to the purchasing page

       @Outline
       Scenario: As a user I want to be able to input my information into the purchasing form so that I can buy my ticket

         Given I am on the Purchase Ticket page
         When I input the correct information into the form
         And Submit the form
         Then I should be at the Purchase confirmation page