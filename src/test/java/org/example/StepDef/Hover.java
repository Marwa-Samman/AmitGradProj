package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.StepDef.Hook.driver;


public class Hover {

    LandingPage Landing = new LandingPage();



    @Given("User Hover Over Category")
    public void UserHoverOverCategory() throws InterruptedException {
        Actions Action = new Actions(driver);
        int count = Landing.Categories.size();
        int min = 0;
        int max = count-1;
        int selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(count);
        Action.moveToElement(Landing.Categories.get(selectedCategory)).perform();
        Thread.sleep(2000);

    }

    @When("User Tap Sub-Category")
    public void userTapSubCategory() {

        int count = Landing.Categories.size();
        int min = 0;
        int max = count-1;
        int selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(selectedCategory);
        Landing.SubCategories.get(selectedCategory).click();

    }


    @Then("User Is Redirected To Sub-Category Page")
    public void userIsRedirectedToSubCategoryPage() {

       String Title = Landing.PageTitle.getText().toLowerCase().trim();
        Assert.assertEquals(Title,"shoes");


    }
}
