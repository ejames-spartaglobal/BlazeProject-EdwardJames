package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TravelTheWorldPage {
    private WebDriver driver;
    private String travelURL = "http://blazedemo.com/index.php";


    public TravelTheWorldPage(WebDriver driver) {
        this.driver = driver;
    }

    public TravelTheWorldPage goToTravelPage(){
        driver.navigate().to(travelURL);
        return this;
    }
    public TravelTheWorldPage waitForElement() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public TravelTheWorldPage selectDeparture(){
        driver.findElement(By.cssSelector("body > div.container > form > select:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body > div.container > form > select:nth-child(1) > option:nth-child(3)")).click();
        return this;
    }

    public TravelTheWorldPage selectDestination(){
        driver.findElement(By.cssSelector("body > div.container > form > select:nth-child(4)")).click();
        driver.findElement(By.cssSelector("body > div.container > form > select:nth-child(4) > option:nth-child(2)")).click();
        return this;
    }

    public TravelTheWorldPage submitFindFlight(){
        driver.findElement(By.cssSelector("body > div.container > form > div > input")).submit();
        return this;
    }

    public TravelTheWorldPage goToHomePage(){
        driver.findElement(By.linkText("home")).click();
        return this;
    }
}
