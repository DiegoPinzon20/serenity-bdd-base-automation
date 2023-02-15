package com.reliquias.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/web/search_a_trip.feature"},
        glue = {"co.com.challenge.automation.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "json:target/serenity-reports/web_applications/search_trip_aa/cucumber.json",
                "html:target/serenity-reports/web_applications/search_trip_aa/serenity-html-report.html",
                "rerun:target/serenity-reports/web_applications/search_trip_aa/rerun.txt"
        }
)
public class LoginRunner {

}