package org.example.Tests;

import org.example.Pages.FlightsPage;
import org.example.Pages.Homepage;
import org.example.Pages.TravelTheWorldPage;
import org.example.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlazeTests {

    private static SeleniumConfig seleniumConfig;
    private static TravelTheWorldPage travelTheWorldPage;
    private static FlightsPage flightsPage;
    private static Homepage homepage;

    @BeforeClass
    public static void setup()
    {
        seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a003/Downloads/chromedriver 2");

    }

    @Test
    public void testNavToTravelPage(){
        travelTheWorldPage.goToTravelPage();
    }

    @Test
    public void testDeparture(){
        travelTheWorldPage.goToTravelPage().waitForElement().selectDeparture();
    }

    @Test
    public void testDestination(){
        travelTheWorldPage.goToTravelPage().waitForElement().selectDestination();
    }

    @Test
    public void testFindFlights(){
        travelTheWorldPage.goToTravelPage().waitForElement().submitFindFlight();
        assertEquals(seleniumConfig.getDriver().getCurrentUrl(),"http://blazedemo.com/reserve.php");
    }

    @Test
    public void testFlightForm(){
        travelTheWorldPage.goToTravelPage().waitForElement().selectDeparture().selectDeparture().submitFindFlight().waitForElement();
        flightsPage.selectFlight();
        flightsPage.fillFormName().fillFormAddress().fillFormCity().fillFormState().fillFormZipCode().fillFormCreditCardNumber().fillCardName().purchaseFlight();
    }

    @Test
    public void testHomeButton(){
        travelTheWorldPage.goToTravelPage().goToHomePage();
    }

    @Test
    public void testLogin(){
        travelTheWorldPage.goToTravelPage().goToHomePage();
        homepage.enterLogin();
    }
}
