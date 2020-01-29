package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
    private WebDriver driver;

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public FlightsPage selectFlight(){
        driver.findElement(By.cssSelector("body > div.container > table > tbody > tr:nth-child(1) > td:nth-child(2) > input")).click();
        return this;
    }

    public FlightsPage fillFormName(){
        driver.findElement(By.id("inputName")).sendKeys("Full Name");
        return this;
    }

    public FlightsPage fillFormAddress(){
        driver.findElement(By.id("address")).sendKeys("1234 Name Street");
        return this;
    }

    public FlightsPage fillFormCity(){
        driver.findElement(By.id("city")).sendKeys("Paris");
        return this;
    }

    public FlightsPage fillFormState(){
        driver.findElement(By.id("state")).sendKeys("New York");
        return this;
    }

    public FlightsPage fillFormZipCode(){
        driver.findElement(By.id("zipCode")).sendKeys("123456");
        return this;
    }

    public FlightsPage fillFormCreditCardNumber(){
        driver.findElement(By.id("creditCardNumber")).sendKeys("12345678910");
        return this;
    }

    public FlightsPage fillCardName(){
        driver.findElement(By.id("nameOnCard")).sendKeys("Joseph Bloggs");
        return  this;
    }

    public FlightsPage purchaseFlight(){
        driver.findElement(By.cssSelector("body > div.container > form > div:nth-child(12) > div > input")).click();
        return this;
    }
}
