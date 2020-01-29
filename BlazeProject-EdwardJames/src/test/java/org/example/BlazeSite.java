package org.example;

import org.example.Pages.FlightsPage;
import org.example.Pages.Homepage;
import org.example.Pages.TravelTheWorldPage;
import org.example.SeleniumConfig.SeleniumConfig;
import org.openqa.selenium.WebDriver;

public class BlazeSite {

    private WebDriver driver;
    public static FlightsPage flightsPage;
    public static Homepage homepage;
    public static TravelTheWorldPage travelTheWorldPage;
    public static SeleniumConfig seleniumConfig;

    public BlazeSite (WebDriver driver){
        this.driver=driver;
        travelTheWorldPage = new TravelTheWorldPage(driver);
        flightsPage=new FlightsPage(driver);
        homepage = new Homepage(driver);
    }

    public Homepage homepage(){
        return homepage;
    }

    public TravelTheWorldPage travelTheWorldPage(){
        return travelTheWorldPage;
    }

    public FlightsPage returnFlightPage(){
        return flightsPage;
    }


}
