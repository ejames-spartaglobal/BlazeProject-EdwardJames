package org.example.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BlazeSite;
import org.example.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;


public class StepDefs {
    //Enter your Chromedriver path in =to the driver path
    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a003/Downloads/chromedriver 2");
    private static BlazeSite blazeSite=new BlazeSite(seleniumConfig.getDriver());;



    @Given("I am on the Travel the World page")
    public void i_am_on_the_Travel_the_World_page() {
        blazeSite.travelTheWorldPage().goToTravelPage();
    }

    @When("I select my departure city")
    public void i_select_my_departure_city() {
        blazeSite.travelTheWorldPage().selectDeparture().waitForElement();
    }

    @And("I select my destination city")
    public void i_select_my_destination_city() {
        blazeSite.travelTheWorldPage().selectDestination().waitForElement();
    }

    @And("I have clicked on the Find Flights button")
    public void i_have_clicked_on_the_Find_Flights_button() {
        blazeSite.travelTheWorldPage().submitFindFlight();
    }

    @Then("I will be able to view all the flights I can potentially get which fit my criteria")
    public void i_will_be_able_to_view_all_the_flights_I_can_potentially_get_which_fit_my_criteria() {
       assertEquals(seleniumConfig.getDriver().getCurrentUrl(),"http://blazedemo.com/reserve.php");
    }




    @Given("I am on the Find Flights page")
    public void i_am_on_the_Find_Flights_page() {
        blazeSite.travelTheWorldPage().goToTravelPage().waitForElement().submitFindFlight();

    }

    @When("I select my desired flight")
    public void i_select_my_desired_flight() {
        blazeSite.flightsPage.selectFlight();
    }

    @Then("I can go to the purchasing page")
    public void i_can_go_to_the_purchasing_page() {
        assertEquals(seleniumConfig.getDriver().getCurrentUrl(),"http://blazedemo.com/purchase.php");
    }


    @Given("I am on the Purchase Ticket page")
    public void i_am_on_the_Purchase_Ticket_page() {
        blazeSite.travelTheWorldPage().goToTravelPage().waitForElement().submitFindFlight();
        blazeSite.flightsPage.selectFlight();
        blazeSite.travelTheWorldPage().waitForElement();
    }

    @When("I input the correct information into the form")
    public void i_input_the_correct_information_into_the_form() {
        blazeSite.flightsPage.fillFormName().fillFormAddress().fillFormCity().fillFormState().fillFormZipCode().fillFormCreditCardNumber().fillCardName();

    }

    @When("Submit the form")
    public void submit_the_form() {
        blazeSite.returnFlightPage().purchaseFlight();
    }

    @Then("I should be at the Purchase confirmation page")
    public void i_should_be_at_the_Purchase_confirmation_page() {
        assertEquals(seleniumConfig.getDriver().getCurrentUrl(),"http://blazedemo.com/confirmation.php");
    }

}
