package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.List;

import static org.example.StepDef.Hook.driver;


public class Search {

    LandingPage Landing = new LandingPage();


    @Given("User Tapped Search Bar")
    public void userTappedSearchBar(){

        Landing.searchBar.click();

    }


    @When("User Provide Search Keywords As {string}")
    public void userProvideSearchKeywordsAs(String arg0) {


        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Landing.searchBar.sendKeys(arg0);
        Landing.searchButton.click();
    }


    @Then("User Get Relevant Search Results")
    public void userGetRelevantSearchResults() {

        SoftAssert soft = new SoftAssert();
        String Current = driver.getCurrentUrl();
        String Partial = "https://demo.nopcommerce.com/search";
        soft.assertTrue(Current.contains(Partial));
        System.out.println(Landing.ResultsCount.size());

         Object[] Items = Landing.ResultsCount.toArray();


        for (int i=0; i<Items.length; i++) {

            List<String> tName = List.of("Book", "laptop", "nike");
            String Title;
            Title = driver.findElement(By.className("item-box")).getText();
            soft.assertTrue(tName.stream().anyMatch(Title::equalsIgnoreCase));

        }

        }


    @When("User Provide {string}")
    public void userProvide(String arg0) {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Landing.searchBar.sendKeys(arg0);
        Landing.searchButton.click();

    }


    @Then("Search Results Are Clickable And Return Relevant Content")
    public void searchResultsAreClickableAndReturnRelevantContent() {

        String Key = Landing.Key.getText();
        Landing.Item.click();
        String SKU = Landing.SKU.getText();
        Assert.assertTrue(SKU.contains(Key));

    }
}
