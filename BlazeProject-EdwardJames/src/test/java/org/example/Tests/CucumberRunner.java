package org.example.Tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "/Users/tech-a003/IdeaProjects/BlazeProject-EdwardJames/src/test/resources/Features",
        glue = "org.example.stepdefs"
)

public class CucumberRunner {


}
