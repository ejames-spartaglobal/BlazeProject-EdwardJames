package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage enterLogin(){
        driver.findElement(By.cssSelector("#email")).sendKeys("ejames@spartaglobal.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        return this;
    }
}
